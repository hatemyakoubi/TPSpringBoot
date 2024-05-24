package com.example.examen.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen.Entities.Categorie;
import com.example.examen.Repository.CategorieRepository;

@Service
public class CategorieServiceImplementation implements CategorieService{
    @Autowired
    private CategorieRepository categorieRepository;

    @Override
    public Categorie save(Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    @Override
    public List<Categorie> findAll() {
        return categorieRepository.findAll();
    }

    @Override
    public List<Categorie> findByNomContaining(String text) {
        return categorieRepository.findByNomContaining(text);
    }

    @Override
    public List<Categorie> findByNomAndDescriptionContaining(String nom, String description) {
        return categorieRepository.findByNomAndDescriptionContaining(nom , description);
    }


}
