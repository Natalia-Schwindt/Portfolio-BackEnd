package com.PortfolioWeb.NS.service;

import com.PortfolioWeb.NS.model.Persona;
import java.util.List;

public interface IPersonaService {
    
    public List <Persona> verPersonas ();
    public void crearPersona (Persona p);
    public void deletePersona (Long id);
    public Persona buscarPersona (Long id);
    public void savePersona(Persona p);
}