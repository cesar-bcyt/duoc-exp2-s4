package com.example.peliculas.service;

import java.util.List;
import java.util.Optional;

import com.example.peliculas.model.Pelicula;

public interface PeliculaService {
    List<Pelicula> getAllPeliculas();
    Optional<Pelicula> getPeliculaById(Long id);
}
