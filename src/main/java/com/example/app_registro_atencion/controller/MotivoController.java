package com.example.app_registro_atencion.controller;
import com.example.app_registro_atencion.entity.Motivo;
import com.example.app_registro_atencion.service.MotivoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200, *")
@RestController
@RequestMapping("/api/motivos")
public class MotivoController {


    private final MotivoService motivoService;

    //constructor
    public MotivoController (MotivoService motivoService) {this.motivoService = motivoService;}

    //http://localhost:8080/api/personas
    @PostMapping //crear nueva motivo
    public Motivo save(@RequestBody Motivo motivo){return motivoService.save(motivo);
    }

    //http://localhost:8080/api/motivos
    @GetMapping //listar todos los motivos
    public List<Motivo> findAll(){
        return motivoService.findAll();
    }

    //http://localhost:8080/api/personas/id
    @GetMapping("/{id}") //buscar por id de la base de datos
    public Motivo findById(@PathVariable Integer id){
        return motivoService.findById(id);
    }

    //http://localhost:8080/api/personas/id
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        motivoService.deleteById(id);
    }

    //http://localhost:8080/api/personas
    @PutMapping
    public Motivo updateMotivo(@RequestBody Motivo motivo){
        Motivo motivoDb = motivoService.findById(motivo.getMotivoId());
        motivoDb.setMotivo(motivo.getMotivo());
        return motivoService.update(motivoDb);
    }
}


