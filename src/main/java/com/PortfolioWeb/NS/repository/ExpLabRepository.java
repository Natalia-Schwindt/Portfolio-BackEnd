package com.PortfolioWeb.NS.repository;

import com.PortfolioWeb.NS.model.ExpLab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpLabRepository extends JpaRepository <ExpLab, Long>{
    
}
