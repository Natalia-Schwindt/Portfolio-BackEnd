package com.PortfolioWeb.NS.repository;

import com.PortfolioWeb.NS.model.Tecnologia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnologiaRepository extends CrudRepository <Tecnologia, Long>{

}
