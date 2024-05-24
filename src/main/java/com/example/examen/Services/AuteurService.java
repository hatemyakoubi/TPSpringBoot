package com.example.examen.Services;

import java.util.List;

import com.example.examen.Entities.Auteur;

public interface AuteurService {

    Auteur save(Auteur auteur);

    List<Auteur> findAll();

    List<Auteur> findByNomAndPrenom(String nom, String prenom);


}