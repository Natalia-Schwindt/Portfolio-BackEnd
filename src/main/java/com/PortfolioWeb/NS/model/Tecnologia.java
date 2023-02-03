package com.PortfolioWeb.NS.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="tecnologia")
public class Tecnologia implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="porcentajeConocimiento")
    private Integer porcentajeConocimiento;

    public Tecnologia() {
    }

    public Tecnologia(Long id, String nombre, Integer porcentajeConocimiento) {
        this.id = id;
        this.nombre = nombre;
        this.porcentajeConocimiento = porcentajeConocimiento;
    }
}
