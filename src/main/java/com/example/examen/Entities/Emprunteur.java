package com.example.examen.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Emprunteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String adresse;

    @ManyToMany
    @JoinTable(name = "emprunteur_livre",
            joinColumns = @JoinColumn(name = "emprunteur_id"),
            inverseJoinColumns = @JoinColumn(name = "livre_id"))
    private List<Livre> livres;
}

