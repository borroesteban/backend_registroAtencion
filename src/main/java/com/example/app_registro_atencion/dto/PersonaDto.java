package com.example.app_registro_atencion.dto;

import com.example.app_registro_atencion.entity.Persona;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
public class PersonaDto {

    private Integer id;
    private String firstName;
    private String lastName;
    private Integer dni;
    private Long cantidadAtenciones;
    private String cellphone;
    private String  email;
    private String adress;
    public PersonaDto() {
    }
    public PersonaDto(Persona persona, Long cantidadAtenciones) {
        this.id = persona.getId();
        this.firstName = persona.getFirstName();
        this.lastName = persona.getLastName();
        this.dni = persona.getDni();
        this.cantidadAtenciones = cantidadAtenciones;
        this.cellphone = persona.getCellphone();
        this.email = persona.getEmail();
        this.adress = persona.getAdress();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Long getCantidadAtenciones() {
        return cantidadAtenciones;
    }

    public void setCantidadAtenciones(Long cantidadAtenciones) {
        this.cantidadAtenciones = cantidadAtenciones;
    }

    public String getCellphone() {return cellphone;}

    public void setCellphone(String cellphone) {this.cellphone = cellphone;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getAdress() {return adress;}

    public void setAdress(String adress) {this.adress = adress;}
}

