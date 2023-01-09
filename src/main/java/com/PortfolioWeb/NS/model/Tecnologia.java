package com.PortfolioWeb.NS.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Tecnologia implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private Integer porcentajeConocimiento;

    public Tecnologia() {
    }

    public Tecnologia(Long id, String nombre, Integer porcentajeConocimiento) {
        this.id = id;
        this.nombre = nombre;
        this.porcentajeConocimiento = porcentajeConocimiento;
    }
}
