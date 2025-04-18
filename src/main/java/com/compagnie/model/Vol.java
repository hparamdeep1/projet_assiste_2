
package com.compagnie.model;

import jakarta.persistence.*;

@Entity
public class Vol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String origine;
    private String destination;
    private String dateHeureDepart;
    private String dateHeureArrivee;

    public Vol() {}
    
    public Vol(String origine, String destination, String dateHeureDepart, String dateHeureArrivee) {
        this.origine = origine;
        this.destination = destination;
        this.dateHeureDepart = dateHeureDepart;
        this.dateHeureArrivee = dateHeureArrivee;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public String getOrigine() { return origine; }
    public String getDestination() { return destination; }
    public String getDateHeureDepart() { return dateHeureDepart; }
    public String getDateHeureArrivee() { return dateHeureArrivee; }

    public void setId(Long id) { this.id = id; }
    public void setOrigine(String origine) { this.origine = origine; }
    public void setDestination(String destination) { this.destination = destination; }
    public void setDateHeureDepart(String d) { this.dateHeureDepart = d; }
    public void setDateHeureArrivee(String d) { this.dateHeureArrivee = d; }
}
