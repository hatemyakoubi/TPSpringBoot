package com.example.examen.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.examen.Entities.Livre;

@Repository
public interface LivreRepository extends JpaRepository<Livre, Long> {
    List<Livre> findByTitreContaining(String text);
    List<Livre> findByPrixLessThan(double prix);
}