package com.PortfolioWeb.NS.service;

import com.PortfolioWeb.NS.model.Proyecto;
import com.PortfolioWeb.NS.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{

    @Autowired
    public ProyectoRepository proyeRepo;
    
    @Override
    public List<Proyecto> verProyecto() {
       return proyeRepo.findAll();
    }

    @Override
    public void crearProyecto(Proyecto y) {
        proyeRepo.save(y);
    }

    @Override
    public void deleteProyecto(Long id) {
        proyeRepo.deleteById(id);
    }

    @Override
    public Proyecto buscarProyecto(Long id) {
        return proyeRepo.findById(id).orElse(null);
    }

    @Override
    public void saveProyecto(Proyecto y) {
        proyeRepo.save(y);
    }
    
}
