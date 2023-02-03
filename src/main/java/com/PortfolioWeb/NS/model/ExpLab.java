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
@Table(name="experiencialaboral")
public class ExpLab implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;
    @Column(name="nombreEmpresa")
    private String nombreEmpresa;
    @Column(name="puesto")
    private String puesto;  
    @Column(name="esTrabajoActual")
    private String esTrabajoActual;    
    @Column(name="fechaInicio")
    private Integer fechaInicio;
    @Column(name="fechaFin")
    private Integer fechaFin;  
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="urlLogo")
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
