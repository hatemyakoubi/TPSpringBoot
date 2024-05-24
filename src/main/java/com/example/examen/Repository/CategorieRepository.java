package com.example.examen.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.examen.Entities.Categorie;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long> {
    List<Categorie> findByNomContaining(String text);
    List<Categorie> findByNomAndDescriptionContaining(String nom, String description);
}
