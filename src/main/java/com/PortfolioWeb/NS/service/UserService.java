
package com.PortfolioWeb.NS.service;

import com.PortfolioWeb.NS.model.User;
import com.PortfolioWeb.NS.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{
    
    @Autowired
    public UserRepository userRepo;
    
    @Override
    public List<User> verUser() {
       return (List<User>) userRepo.findAll();
    }

    @Override
    public void crearUser(User u) {
         userRepo.save(u);
    }

    @Override
    public void deleteUser(Long id) {
      userRepo.deleteById(id);
    }

    @Override
    public User buscarUser(Long id) {
        return userRepo.findById(id).orElse(null);
    }

    @Override
    public void saveUser(User u) {
         userRepo.save(u);
    }
}
