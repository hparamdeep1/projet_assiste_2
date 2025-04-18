
package com.compagnie.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Client extends Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    private String passeport;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Reservation> reservations = new ArrayList<>();

    public String getPasseport() { return passeport; }
    public void setPasseport(String passeport) { this.passeport = passeport; }
    public List<Reservation> getReservations() { return reservations; }
}
