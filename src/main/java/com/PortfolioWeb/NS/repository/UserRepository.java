package com.PortfolioWeb.NS.repository;

import com.PortfolioWeb.NS.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, Long>{
    
}