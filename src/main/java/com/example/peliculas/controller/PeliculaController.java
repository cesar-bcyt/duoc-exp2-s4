package com.example.peliculas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.peliculas.model.Pelicula;
import com.example.peliculas.service.PeliculaService;


@RestController
@RequestMapping("/peliculas")
public class PeliculaController {
    @Autowired
    private PeliculaService peliculaService;

    @GetMapping
    public List<Pelicula> getAllPeliculas() {
        List<Pelicula> peliculas = peliculaService.getAllPeliculas();
        System.out.println(peliculas);
        return peliculas;
    }

    @GetMapping("/{id}")
    public Optional<Pelicula> getPeliculaById(@PathVariable Long id) {
        return peliculaService.getPeliculaById(id);
    }
}
