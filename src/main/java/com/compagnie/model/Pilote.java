
package com.compagnie.model;

import jakarta.persistence.Entity;

@Entity
public class Pilote extends Employe {
    private String licence;
    private int heuresDeVol;

    public String getLicence() { return licence; }
    public void setLicence(String licence) { this.licence = licence; }
    public int getHeuresDeVol() { return heuresDeVol; }
    public void setHeuresDeVol(int heuresDeVol) { this.heuresDeVol = heuresDeVol; }
}
