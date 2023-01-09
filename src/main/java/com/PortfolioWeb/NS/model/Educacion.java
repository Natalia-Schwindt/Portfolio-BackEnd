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
public class Educacion implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String estudioCursado;
    private String nombreInstitucion; 
    private Integer año;
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
