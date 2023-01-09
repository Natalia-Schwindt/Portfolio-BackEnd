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
public class ExpLab implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombreEmpresa;
    private String puesto;  
    private String esTrabajoActual;      
    private Integer fechaInicio;
    private Integer fechaFin;      
    private String descripcion;
    private String urlLogo;

    public ExpLab() {
    }

    public ExpLab(Long id, String nombreEmpresa, String puesto, String esTrabajoActual, Integer fechaInicio, Integer fechaFin, String descripcion, String urlLogo) {
        this.id = id;
        this.nombreEmpresa = nombreEmpresa;
        this.puesto = puesto;
        this.esTrabajoActual = esTrabajoActual;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
        this.urlLogo = urlLogo;
    }
    
    
}
