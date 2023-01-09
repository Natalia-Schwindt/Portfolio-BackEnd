package com.PortfolioWeb.NS.service;

import com.PortfolioWeb.NS.model.ExpLab;
import java.util.List;

public interface IExpLabService {
    
    public List<ExpLab> verExpLab ();
    public void crearExpLab (ExpLab l);
    public void deleteExpLab (Long id);
    public ExpLab buscarExpLab (Long id);
    public void saveExpLab(ExpLab l);
}
