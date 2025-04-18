package com.compagnie.service;

import com.compagnie.model.Vol;
import com.compagnie.repository.VolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

@Service
public class FichierVolService {

    @Autowired
    private VolRepository volRepository;

    @PostConstruct
    public void importerVolsDepuisFichier() {
        try {
            ClassPathResource resource = new ClassPathResource("vols.csv");
            BufferedReader reader = new BufferedReader(new InputStreamReader(resource.getInputStream(), StandardCharsets.UTF_8));

            String ligne;
            boolean premiereLigne = true;

            while ((ligne = reader.readLine()) != null) {
                if (premiereLigne) {
                    premiereLigne = false;
                    continue;
                }

                String[] parties = ligne.split(",");
                if (parties.length >= 4) {
                    Vol vol = new Vol(parties[0], parties[1], parties[2], parties[3]);
                    volRepository.save(vol);
                }
            }

            reader.close();
            System.out.println("✅ Vols importés depuis le fichier CSV.");
        } catch (Exception e) {
            System.err.println("⚠️ Erreur lors de l'importation : " + e.getMessage());
        }
    }
}
