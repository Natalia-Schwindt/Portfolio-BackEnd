package com.PortfolioWeb.NS.service;

import com.PortfolioWeb.NS.model.Educacion;
import com.PortfolioWeb.NS.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{

    @Autowired
    public EducacionRepository educaRepo;
    
    @Override
    public List<Educacion> verEducacion() {
        return educaRepo.findAll();
    }

    @Override
    public void crearEducacion(Educacion e) {
        educaRepo.save(e);
    }

    @Override
    public void deleteEducacion(Long id) {
        educaRepo.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        return educaRepo.findById(id).orElse(null);
    }

    @Override
    public void saveEducacion(Educacion e) {
        educaRepo.save(e);
    }

    
}  