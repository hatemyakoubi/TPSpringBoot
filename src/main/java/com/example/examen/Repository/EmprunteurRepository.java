package com.example.examen.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.examen.Entities.Emprunteur;

@Repository
public interface EmprunteurRepository extends JpaRepository<Emprunteur, Long> {
    List<Emprunteur> findByAdresseContaining(String text);
    List<Emprunteur> findByNomAndPrenom(String nom, String prenom);
}
