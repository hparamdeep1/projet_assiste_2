
package com.compagnie.service;

import com.compagnie.model.Client;
import com.compagnie.model.Vol;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Statistiques {
    public static int totalVols(List<Vol> vols) {
        return vols.size();
    }

    public static int totalClients(List<Client> clients) {
        return clients.size();
    }

    public static Map<String, Integer> destinationsPopulaires(List<Vol> vols) {
        Map<String, Integer> map = new HashMap<>();
        for (Vol v : vols) {
            map.put(v.getDestination(), map.getOrDefault(v.getDestination(), 0) + 1);
        }
        return map;
    }
}
