package com.example.examen.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String description;

    @ManyToMany(mappedBy = "categories")
    private List<Livre> livres;
}
