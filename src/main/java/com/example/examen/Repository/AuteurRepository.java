package com.example.examen.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.examen.Entities.Auteur;

@Repository
public interface AuteurRepository extends JpaRepository<Auteur, Long> {
    List<Auteur> findByNomAndPrenom(String nom, String prenom);
}