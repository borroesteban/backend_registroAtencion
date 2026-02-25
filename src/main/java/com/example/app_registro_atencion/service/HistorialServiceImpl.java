package com.example.app_registro_atencion.service;
import com.example.app_registro_atencion.entity.Historial;
import com.example.app_registro_atencion.entity.Motivo;
import com.example.app_registro_atencion.entity.Persona;
import com.example.app_registro_atencion.exception.ResourceNotFoundException;
import com.example.app_registro_atencion.repository.HistorialRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistorialServiceImpl implements HistorialService {

    private HistorialRepository historialRepository;
    public HistorialServiceImpl(HistorialRepository historialRepository) {
        this.historialRepository = historialRepository;
    }

    @Override
    public Motivo motivoFindById(Integer motivo) {
        Historial historial = historialRepository.findById(motivo).orElseThrow(()-> {
        throw new ResourceNotFoundException("Historial con motivoId "+motivoFindById(motivo)+" no se encuentra.");
        });
        return historial.getMotivo();
    }

   @Override
   public Persona personaFindById(Integer persona) {
       Historial historial = historialRepository.findById(persona).orElseThrow(()-> {
           throw new ResourceNotFoundException("Historial con personaId "+personaFindById(persona)+" no se encuentra.");
       });
       return historial.getPersona();
   }

    @Override
    public Historial historialSave(Historial historial) {
        return historialRepository.save(historial);
    }

    @Override
    public List<Historial> findAll() {
        return historialRepository.findAll();
    }
}
