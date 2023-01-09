package com.PortfolioWeb.NS.service;

import com.PortfolioWeb.NS.model.User;
import java.util.List;

public interface IUserService {
    
    public List <User> verUser ();
    public void crearUser (User u);
    public void deleteUser (Long id);
    public User buscarUser (Long id);
    public void saveUser(User u);
}
