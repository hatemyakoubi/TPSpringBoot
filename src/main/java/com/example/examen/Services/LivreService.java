package com.example.examen.Services;

import java.util.List;

import com.example.examen.Entities.Livre;

public interface LivreService {

     Livre save(Livre livre);

     List<Livre> findAll();

     List<Livre> findByTitreContaining(String text);

     List<Livre> findByPrixLessThan(double prix);
}
