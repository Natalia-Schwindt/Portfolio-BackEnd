package com.PortfolioWeb.NS.service;

import com.PortfolioWeb.NS.model.Tecnologia;
import com.PortfolioWeb.NS.repository.TecnologiaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TecnologiaService implements ITecnologiaService{

    @Autowired
    public TecnologiaRepository tecnoRepo;
    
    @Override
    public List<Tecnologia> verTecnologia() {
        return (List<Tecnologia>) tecnoRepo.findAll();
    }

    @Override
    public void crearTecnologia(Tecnologia t) {
        tecnoRepo.save(t);
    }

    @Override
    public void deleteTecnologia(Long id) {
        tecnoRepo.deleteById(id);
    }

    @Override
    public Tecnologia buscarTecnologia(Long id) {
        return tecnoRepo.findById(id).orElse(null);
    }

    @Override
    public void saveTecnologia(Tecnologia t) {
        tecnoRepo.save(t);
    }
    
}
