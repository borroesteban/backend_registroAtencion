package com.example.app_registro_atencion.repository;

import com.example.app_registro_atencion.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.beans.Customizer;
import java.util.Optional;
@CrossOrigin(origins = "http://localhost:4200, *")
@Repository
public interface PersonaRepository extends JpaRepository <Persona, Integer> {
    Optional<Persona> findByDni(Integer dni);
}
