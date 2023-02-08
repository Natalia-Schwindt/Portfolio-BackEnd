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
    @Column(name="estudiocursado")
    private String estudiocursado;
    @Column(name="nombreinstitucion")
    private String nombreinstitucion; 
    @Column(name="año")
    private Integer año;
    @Column(name="urllogo")
    private String urllogo;
    @Column (name="persona_id")
    private Long persona_id;

    public Educacion() {
    }

    public Educacion(Long id, String estudiocursado, String nombreinstitucion, Integer año, String urllogo, Long persona_id) {
        this.id = id;
        this.estudiocursado = estudiocursado;
        this.nombreinstitucion = nombreinstitucion;
        this.año = año;
        this.urllogo = urllogo;
        this.persona_id = persona_id;
    }
}
