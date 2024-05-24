package com.example.examen.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen.Entities.Livre;
import com.example.examen.Repository.LivreRepository;

@Service
public class LivreServiceImplementation implements LivreService {
    @Autowired
    private LivreRepository livreRepository;

    @Override
    public Livre save(Livre livre) {
        return livreRepository.save(livre);
    }

    @Override
    public List<Livre> findAll() {
        return livreRepository.findAll();
    }

    @Override
    public List<Livre> findByTitreContaining(String text) {
        return livreRepository.findByTitreContaining(text);
    }

    @Override
    public List<Livre> findByPrixLessThan(double prix) {
        return livreRepository.findByPrixLessThan(prix);
    }
}

