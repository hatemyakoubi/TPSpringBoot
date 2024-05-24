package com.example.examen.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Auteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String CIN;
    private String nom;
    private String prenom;
    private String nationalite;

    @OneToMany(mappedBy = "auteur")
    private List<Livre> livres;
}
