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
    @Column(name="nombreempresa")
    private String nombreempresa;
    @Column(name="puesto")
    private String puesto;  
    @Column(name="estrabajoactual")
    private String estrabajoactual;    
    @Column(name="fechainicio")
    private Integer fechainicio;
    @Column(name="fechafin")
    private Integer fechafin;  
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="urllogo")
    private String urllogo;
    @Column (name="persona_id")
    private Long persona_id;

    public ExpLab() {
    }

    public ExpLab(Long id, String nombreempresa, String puesto, String estrabajoactual, Integer fechainicio, Integer fechafin, String descripcion, String urllogo, Long persona_id) {
        this.id = id;
        this.nombreempresa = nombreempresa;
        this.puesto = puesto;
        this.estrabajoactual = estrabajoactual;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.descripcion = descripcion;
        this.urllogo = urllogo;
        this.persona_id = persona_id;
    }
    
    
}
