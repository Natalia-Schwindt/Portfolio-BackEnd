package com.PortfolioWeb.NS.service;

import com.PortfolioWeb.NS.model.Educacion;
import java.util.List;

public interface IEducacionService {
       
    public List <Educacion> verEducacion ();
    public void crearEducacion (Educacion e);
    public void deleteEducacion (Long id);
    public Educacion buscarEducacion (Long id);
    public void saveEducacion(Educacion e);
}