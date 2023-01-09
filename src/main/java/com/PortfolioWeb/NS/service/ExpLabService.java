package com.PortfolioWeb.NS.service;

import com.PortfolioWeb.NS.model.ExpLab;
import com.PortfolioWeb.NS.repository.ExpLabRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpLabService implements IExpLabService{

    @Autowired
    public ExpLabRepository expLabRepo;
    
    @Override
    public List<ExpLab> verExpLab() {
        return expLabRepo.findAll();
    }

    @Override
    public void crearExpLab(ExpLab l) {
        expLabRepo.save(l);
    }

    @Override
    public void deleteExpLab(Long id) {
        expLabRepo.deleteById(id);
    }

    @Override
    public ExpLab buscarExpLab(Long id) {
        return expLabRepo.findById(id).orElse(null);
    }

    @Override
    public void saveExpLab(ExpLab l) {
        expLabRepo.save(l);
    }
    
}
