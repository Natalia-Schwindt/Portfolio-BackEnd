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
@Table(name="educacion")
public class Educacion implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;
    @Column(name="estudioCursado")
    private String estudioCursado;
    @Column(name="nombreInstitucion")
    private String nombreInstitucion; 
    @Column(name="año")
    private Integer año;
    @Column(name="urlLogo")
    private String urlLogo;

    public Educacion() {
    }

    public Educacion(Long id, String estudioCursado, String nombreInstitucion, Integer año, String urlLogo) {
        this.id = id;
        this.estudioCursado = estudioCursado;
        this.nombreInstitucion = nombreInstitucion;
        this.año = año;
        this.urlLogo = urlLogo;
    }
}
