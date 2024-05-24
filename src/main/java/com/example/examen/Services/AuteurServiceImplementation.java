package com.example.examen.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen.Entities.Auteur;

import java.util.List;

@Service
public class AuteurServiceImplementation implements AuteurService{
    @Autowired
    private com.example.examen.Repository.AuteurRepository auteurRepository;

    @Override
    public com.example.examen.Entities.Auteur save(Auteur auteur) {
        return auteurRepository.save(auteur);
    }

    @Override
    public List<Auteur>  findAll() {
        return auteurRepository.findAll();
    }

    @Override
    public List<Auteur> findByNomAndPrenom(String nom, String prenom) {
        return auteurRepository.findByNomAndPrenom(nom, prenom);
    }

}

