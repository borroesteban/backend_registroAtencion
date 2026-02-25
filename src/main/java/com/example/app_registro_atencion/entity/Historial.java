package com.example.app_registro_atencion.entity;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Historial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer historialId;
    @Column(name="observaciones", nullable = true)
    private String notes;
    @Column(name="fecha", nullable = true)
    private LocalDateTime timeStamp;




    //foreignKey personaId
    @ManyToOne
    @JoinColumn(name="id")
    private Persona persona;

    //foreignkey motivoId
    @ManyToOne
    @JoinColumn(name="motivoId")
    private Motivo motivo;

    public Historial() {
    }
    @PrePersist
    public void prePersist() {
        this.timeStamp = LocalDateTime.now();
    }
    public Historial(Integer historialId) {
        this.historialId = historialId;
    }

    public Historial(LocalDateTime timeStamp, Integer historialId, String notes,Persona  persona,Motivo motivo) {
        this.historialId = historialId;
        this.notes = notes;
        this.persona = persona;
        this.motivo = motivo;
        this.timeStamp=timeStamp;
    }



    public Integer getHistorialId() {
        return historialId;
    }

    public void setHistorialId(Integer historialId) {
        this.historialId = historialId;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Motivo getMotivo() {
        return motivo;
    }

    public void setMotivo(Motivo motivo) {
        this.motivo = motivo;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }
}


