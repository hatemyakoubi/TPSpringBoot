package com.example.examen.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.Entities.Livre;
import com.example.examen.Services.LivreService;

@RestController
@RequestMapping("/api/livres")
public class LivreController {

    @Autowired
    private LivreService livreService;

    @PostMapping
    public Livre save(@RequestBody Livre livre){
        return livreService.save(livre);
    }

    @GetMapping
    public List<Livre> findAll(){
        return livreService.findAll();
    }

    @GetMapping("/search")
    public List<Livre> findByTitreContaining(@RequestParam String text){
        return livreService.findByTitreContaining(text);
    }

    @GetMapping("/prix")
    public List<Livre> findByPrixLessThan(@RequestParam double prix){
        return livreService.findByPrixLessThan(prix);
    }
}