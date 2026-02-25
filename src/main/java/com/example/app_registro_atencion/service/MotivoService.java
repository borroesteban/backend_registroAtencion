package com.example.app_registro_atencion.service;
import com.example.app_registro_atencion.entity.Motivo;
import java.util.List;

    public interface MotivoService {
        Motivo save(Motivo motivo);
        List<Motivo> findAll();
        Motivo findById(Integer motivoId);
        void deleteById(Integer motivoId);
        Motivo update(Motivo motivo);
    }
