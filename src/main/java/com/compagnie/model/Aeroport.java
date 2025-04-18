
package com.compagnie.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Aeroport {
    @Id
    private String nom;
    private String ville;
    private String description;

    public String getNom() { return nom; }
    public String getVille() { return ville; }
    public String getDescription() { return description; }
}
