package com.PortfolioWeb.NS.repository;

import com.PortfolioWeb.NS.model.Tecnologia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnologiaRepository extends JpaRepository <Tecnologia, Long>{

}
