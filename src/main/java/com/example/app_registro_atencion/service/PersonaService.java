package com.example.app_registro_atencion.service;

import com.example.app_registro_atencion.entity.Persona;
import java.util.List;
import java.util.Optional;

public interface PersonaService {

    Optional<Persona> findByDni(Integer dni);
    Persona save(Persona persona);
    List<Persona> findAll();
    Persona findById(Integer id);
    void deleteById(Integer id);
    Persona update(Persona persona);
    Optional<Persona> findByDniDto(Integer dni);
}

