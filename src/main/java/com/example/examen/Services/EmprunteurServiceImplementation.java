package com.example.examen.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen.Entities.Emprunteur;
import com.example.examen.Repository.EmprunteurRepository;

@Service
public class EmprunteurServiceImplementation implements EmprunteurService{
    @Autowired
    private EmprunteurRepository emprunteurRepository;

	@Override
	public Emprunteur save(Emprunteur emprunteur) {
		// TODO Auto-generated method stub
		return emprunteurRepository.save(emprunteur);
	}

	@Override
	public List<Emprunteur> findAll() {
		// TODO Auto-generated method stub
		 return emprunteurRepository.findAll();
	}

	@Override
	public List<Emprunteur> findByAdresseContaining(String text) {
		// TODO Auto-generated method stub
		 return emprunteurRepository.findByAdresseContaining(text);
	}

	@Override
	public List<Emprunteur> findByNomAndPrenom(String nom, String prenom) {
		// TODO Auto-generated method stub
		return emprunteurRepository.findByNomAndPrenom(nom, prenom);
	}

   
}

