package com.example.app_registro_atencion.service;

import com.example.app_registro_atencion.entity.Motivo;
import com.example.app_registro_atencion.exception.ResourceNotFoundException;
import com.example.app_registro_atencion.repository.MotivoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotivoServiceImpl implements MotivoService {

    private final MotivoRepository motivoRepository;

    public MotivoServiceImpl(MotivoRepository motivoRepository) {
        this.motivoRepository = motivoRepository;
    }

    @Override
    public Motivo save(Motivo motivo) {
        return motivoRepository.save(motivo);
    }

    @Override
    public List<Motivo> findAll() {
        return motivoRepository.findAll();
    }

    @Override
    public Motivo findById(Integer motivoId) {
        Motivo motivo = motivoRepository.findById(motivoId).orElseThrow(
                () -> {
                    throw new ResourceNotFoundException("Motivo con motivoId "+motivoId+" no se encuentra.");
                });
        //return motivoRepository.findById(motivoId).get();
        return motivo;
    }

    @Override
    public void deleteById(Integer motivoId) {
        motivoRepository.deleteById(motivoId);
    }

    @Override
    public Motivo update(Motivo motivo) {
        return motivoRepository.save(motivo);
    }
}
