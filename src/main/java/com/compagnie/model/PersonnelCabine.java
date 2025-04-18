
package com.compagnie.model;

import jakarta.persistence.Entity;

@Entity
public class PersonnelCabine extends Employe {
    private String qualification;

    public String getQualification() { return qualification; }
    public void setQualification(String qualification) { this.qualification = qualification; }
}
