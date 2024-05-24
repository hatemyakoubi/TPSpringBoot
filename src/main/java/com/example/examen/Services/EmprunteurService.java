package com.example.examen.Services;

import java.util.List;

import com.example.examen.Entities.Emprunteur;

public interface EmprunteurService {

     Emprunteur save(Emprunteur emprunteur);

     List<Emprunteur> findAll();

     List<Emprunteur> findByAdresseContaining(String text);

     List<Emprunteur> findByNomAndPrenom(String nom, String prenom);
}