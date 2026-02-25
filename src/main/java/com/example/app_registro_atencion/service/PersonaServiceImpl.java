package com.example.app_registro_atencion.service;
import com.example.app_registro_atencion.entity.Persona;
import com.example.app_registro_atencion.exception.ResourceNotFoundException;
import com.example.app_registro_atencion.repository.PersonaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiceImpl implements PersonaService {

    private final PersonaRepository personaRepository;

    public PersonaServiceImpl(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    @Override
    public Persona save(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public List<Persona> findAll() {
        return personaRepository.findAll();
    }

    @Override
    public Persona findById(Integer id) {return personaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Persona con id " + id + " no se encuentra."));}
    @Override
    public Optional<Persona> findByDni(Integer dni) {return personaRepository.findByDni(dni);}

    @Override
    public void deleteById(Integer id) {personaRepository.deleteById(id);}

    @Override
    public Persona update(Persona persona) {return personaRepository.save(persona);
     }

    @Override
    public Optional<Persona> findByDniDto (Integer dni) {return personaRepository.findByDni(dni);
        }
    }

