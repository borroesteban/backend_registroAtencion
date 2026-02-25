package com.example.app_registro_atencion.entity;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Motivo {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer motivoId;

@Column(name="motivo", nullable = false)
private String motivo;

@OneToMany(mappedBy = "motivo")
private List<Historial> motivo_historial_fk = new ArrayList<>();

    public Motivo() { }

    public Motivo(Integer motivoId) {
        this.motivoId = motivoId;
    }

    public Motivo(Integer motivoId, String motivo, List<Historial> motivo_historial_fk) {
        this.motivoId = motivoId;
        this.motivo = motivo;
        this.motivo_historial_fk = motivo_historial_fk;
    }

    public Integer getMotivoId() {
        return motivoId;
    }

    public void setMotivoId(Integer motivoId) {
        this.motivoId = motivoId;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

}