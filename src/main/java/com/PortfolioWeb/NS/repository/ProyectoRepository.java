package com.PortfolioWeb.NS.repository;

import com.PortfolioWeb.NS.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository <Proyecto, Long>{
   
}
