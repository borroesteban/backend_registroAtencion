package com.example.app_registro_atencion.repository;

import com.example.app_registro_atencion.entity.Historial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistorialRepository extends JpaRepository<Historial, Integer> {

    long countByPersonaId(Integer personaId);

    long countByPersona_Id(Integer id);
}

