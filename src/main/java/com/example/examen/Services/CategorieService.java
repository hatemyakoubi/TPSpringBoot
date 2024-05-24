package com.example.examen.Services;



import java.util.List;

import com.example.examen.Entities.Categorie;

public interface CategorieService {

    Categorie save(Categorie categorie);

    List<Categorie> findAll();

    List<Categorie> findByNomContaining(String nom);

    List<Categorie> findByNomAndDescriptionContaining(String nom , String description);
}