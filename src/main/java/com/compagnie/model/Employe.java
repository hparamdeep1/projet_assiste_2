
package com.compagnie.model;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class Employe extends Personne {
    protected String role;
    protected String numeroEmploye;
    protected String dateEmbauche;

    public String getRole() { return role; }
    public String getNumeroEmploye() { return numeroEmploye; }
    public String getDateEmbauche() { return dateEmbauche; }
}
