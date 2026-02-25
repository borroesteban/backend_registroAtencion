package com.example.app_registro_atencion.repository;

import com.example.app_registro_atencion.entity.Motivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotivoRepository extends JpaRepository <Motivo, Integer> {
}
