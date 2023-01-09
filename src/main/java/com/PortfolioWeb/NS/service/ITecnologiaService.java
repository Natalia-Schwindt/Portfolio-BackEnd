package com.PortfolioWeb.NS.service;

import com.PortfolioWeb.NS.model.Tecnologia;
import java.util.List;


public interface ITecnologiaService {
    
    public List <Tecnologia> verTecnologia ();
    public void crearTecnologia (Tecnologia t);
    public void deleteTecnologia (Long id);
    public Tecnologia buscarTecnologia (Long id);
    public void saveTecnologia(Tecnologia t);
}
