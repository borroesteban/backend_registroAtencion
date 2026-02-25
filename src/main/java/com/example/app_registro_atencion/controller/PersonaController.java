package com.example.app_registro_atencion.controller;

import com.example.app_registro_atencion.dto.PersonaDto;
import com.example.app_registro_atencion.entity.Persona;
import com.example.app_registro_atencion.exception.ResourceNotFoundException;
import com.example.app_registro_atencion.service.PersonaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:33137, http://localhost:4200, http://localhost:8080")

//http://localhost:4200, http://localhost:33137,

@RestController
//http://localhost:8080/api/personas
@RequestMapping("/api/personas")
public class PersonaController {
    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    //http://localhost:8080/api/personas
    @PostMapping //crear nueva persona
    public Persona save(@RequestBody Persona persona){return personaService.save(persona);
    }

    //http://localhost:8080/api/personas
    @GetMapping //listar todas las personas
    public List<Persona> findAll(){
        return personaService.findAll();
    }

    //http://localhost:8080/api/personas/id
    @GetMapping("/{id}") //buscar por id de la base de datos
    public Persona findById(@PathVariable Integer id){
        return personaService.findById(id);
    }

    @GetMapping("/dni/{dni}")
    public Persona findByDni(@PathVariable Integer dni) {
        return personaService.findByDni(dni)
                .orElseThrow(() -> new ResourceNotFoundException("DNI: " + dni + " no encontrado"));
    }





    //http://localhost:8080/api/personas/id
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        personaService.deleteById(id);
    }

    //http://localhost:8080/api/personas
    @PutMapping
    public Persona updatePersona(@RequestBody Persona persona){
        Persona personaDb = personaService.findById(persona.getId());
        personaDb.setFirstName(persona.getFirstName());
        personaDb.setLastName(persona.getLastName());
        personaDb.setAdress(persona.getAdress());
        personaDb.setCellphone(persona.getCellphone());
        personaDb.setEmail(persona.getEmail());
        personaDb.setDni(persona.getDni());
        return personaService.update(personaDb);
    }
}
