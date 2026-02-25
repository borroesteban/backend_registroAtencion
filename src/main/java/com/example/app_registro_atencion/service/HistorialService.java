package com.example.app_registro_atencion.service;

import com.example.app_registro_atencion.entity.Historial;
import com.example.app_registro_atencion.entity.Motivo;
import com.example.app_registro_atencion.entity.Persona;
import java.util.List;


public interface HistorialService {
    Motivo motivoFindById(Integer motivo);
    Persona personaFindById(Integer persona);
    Historial historialSave(Historial historial);
    List<Historial>findAll();
}
