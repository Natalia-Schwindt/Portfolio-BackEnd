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
@Table(name="proyecto")
public class Proyecto implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="estado")
    private String estado;
    @Column(name="descripcion")
    private String descripcion;  
    
    public Proyecto() {
    }

    public Proyecto(Long id, String nombre, String estado, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
        this.descripcion = descripcion;
    }
}
