package com.example.app_registro_atencion.entity;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
public class Persona {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique=true, nullable = false)
    private Integer dni;
    @Column(name = "nombre", nullable = false)
    private String firstName;
    @Column(name = "apellido", nullable = false)
    private String lastName;
    @Column(name = "telefono", nullable = true)
    private String cellphone;
    @Column(name = "mail", nullable = true)
    private String email;
    @Column(name = "direccion", nullable = true)
    private String adress;
    @OneToMany(mappedBy = "persona")
    private List<Historial> persona_historial_fk = new ArrayList<>();
    public Persona() {
    }
    public Persona(Integer id, Integer dni, String firstName, String lastName, String cellphone, String email, String adress) {
        this.id = id;
        this.dni = dni;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cellphone = cellphone;
        this.email = email;
        this.adress = adress;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}

