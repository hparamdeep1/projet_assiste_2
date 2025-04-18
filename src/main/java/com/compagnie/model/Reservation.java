
package com.compagnie.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;

    @ManyToOne
    private Client client;

    @ManyToOne
    private Vol vol;

    private LocalDateTime dateReservation;
    private String statut;

    public LocalDateTime getDateReservation() { return dateReservation; }
    public String getStatut() { return statut; }
}
