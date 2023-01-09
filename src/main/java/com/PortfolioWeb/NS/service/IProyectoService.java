package com.PortfolioWeb.NS.service;

import com.PortfolioWeb.NS.model.Proyecto;
import java.util.List;


public interface IProyectoService {
    
    public List <Proyecto> verProyecto ();
    public void crearProyecto (Proyecto y);
    public void deleteProyecto (Long id);
    public Proyecto buscarProyecto (Long id);
    public void saveProyecto(Proyecto y);
}
