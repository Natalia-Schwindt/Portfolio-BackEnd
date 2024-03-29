package com.PortfolioWeb.NS.repository;

import com.PortfolioWeb.NS.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long>{
    
}
