
package com.compagnie.model;

import jakarta.persistence.*;

@Entity
public class Avion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAvion;

    private String immatriculation;
    private String modele;
    private int capacite;
    private boolean disponible;

    public boolean isDisponible() { return disponible; }
}
