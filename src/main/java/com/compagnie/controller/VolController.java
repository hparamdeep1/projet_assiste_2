package com.compagnie.controller;

import com.compagnie.model.Vol;
import com.compagnie.repository.VolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vols")
public class VolController {

    @Autowired
    private VolRepository volRepository;

    // GET: /api/vols
    @GetMapping
    public List<Vol> getAllVols() {
        return volRepository.findAll();
    }

    // POST: /api/vols
    @PostMapping
    public Vol createVol(@RequestBody Vol vol) {
        return volRepository.save(vol);
    }
}
