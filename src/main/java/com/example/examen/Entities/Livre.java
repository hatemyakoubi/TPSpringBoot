package com.example.examen.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String ISBN;
    private double prix;

    @ManyToMany
    @JoinTable(
            name = "livre_categorie",
            joinColumns = @JoinColumn(name = "livre_id"),
            inverseJoinColumns = @JoinColumn(name = "categorie_id")
    )
    private List<Categorie> categories;

    @ManyToOne
    private Auteur auteur;

    @ManyToMany(mappedBy = "livres")
    private List<Emprunteur> emprunteurs;
}
