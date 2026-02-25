package com.example.app_registro_atencion.controller;
import com.example.app_registro_atencion.entity.Historial;
import com.example.app_registro_atencion.service.HistorialService;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@CrossOrigin(origins = "http://localhost:4200, *")
@RestController
@RequestMapping("/api/historial")
public class HistorialController {
    private final HistorialService historialService;

    public HistorialController(HistorialService historialService) {
        this.historialService = historialService;
    }

    //http://localhost:8080/api/historial
    @PostMapping //crear nueva historial
    public Historial historialSave(@RequestBody Historial historial){return historialService.historialSave(historial);
    }

    //http://localhost:8080/api/historial
    @GetMapping //listar todas las personas
    public List<Historial> findAll(){
        return historialService.findAll();
    }

    //cambiar a find by fecha
    //@GetMapping("/{id}") //buscar por id de la base de datos
    //public Historial findById(@PathVariable Integer id){
    //    return historialService.findById(id);
    //}
}
