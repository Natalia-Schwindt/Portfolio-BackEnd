package com.PortfolioWeb.NS.controller;

import com.PortfolioWeb.NS.model.Educacion;
import com.PortfolioWeb.NS.model.ExpLab;
import com.PortfolioWeb.NS.model.Persona;
import com.PortfolioWeb.NS.model.Proyecto;
import com.PortfolioWeb.NS.model.Tecnologia;
import com.PortfolioWeb.NS.model.User;
import com.PortfolioWeb.NS.repository.UserRepository;
import com.PortfolioWeb.NS.service.IEducacionService;
import com.PortfolioWeb.NS.service.IExpLabService;
import com.PortfolioWeb.NS.service.IPersonaService;
import com.PortfolioWeb.NS.service.IProyectoService;
import com.PortfolioWeb.NS.service.ITecnologiaService;
import com.PortfolioWeb.NS.service.IUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    private IPersonaService persoServ;
                
    @PostMapping ("/api/Persona/new")
    public void addPersona(@RequestBody Persona p){
       persoServ.crearPersona(p);
    }
    
    @GetMapping ("/api/Persona/ver")
    @ResponseBody
    public List<Persona> verPersonas (){
        return persoServ.verPersonas();
    }
    
    @PutMapping ("/api/Persona/modificar")
    @ResponseBody
    public void modificarPersona(@RequestBody Persona p){
        persoServ.savePersona(p);
    }
    
    @DeleteMapping ("/api/Persona/delete/{id}")
    public void deletePersona (@PathVariable Long id) {
        persoServ.deletePersona(id);
    }
    
    
    @Autowired
    private IEducacionService educaServ;
                
    @PostMapping ("/api/Educacion/new")
    public void addEducacion(@RequestBody Educacion e){
       educaServ.crearEducacion(e);
    }
    
    @GetMapping ("/api/Educacion/ver")
    @ResponseBody
    public List<Educacion> verEducacion (){
        return educaServ.verEducacion();
    }
    
    @PutMapping ("/api/Educacion/modificar")
    @ResponseBody
    public void modificarEducacion(@RequestBody Educacion e){
        educaServ.saveEducacion(e);
    }
    
    @DeleteMapping ("/api/Educacion/delete/{id}")
    public void deleteEducacion (@PathVariable Long id) {
        educaServ.deleteEducacion(id);
    }
    
    
    @Autowired
    private IExpLabService expLabServ;
                
    @PostMapping ("/api/ExpLab/new")
    public void addExpLab(@RequestBody ExpLab l){
       expLabServ.crearExpLab(l);
    }
    
    @GetMapping ("/api/ExpLab/ver")
    @ResponseBody
    public List<ExpLab> verExpLab (){
        return expLabServ.verExpLab();
    }
    
    @PutMapping ("/api/ExpLab/modificar")
    @ResponseBody
    public void modificarExpLab(@RequestBody ExpLab l){
        expLabServ.saveExpLab(l);
    }
    
    @DeleteMapping ("/api/ExpLab/delete/{id}")
    public void deleteExpLab (@PathVariable Long id) {
        expLabServ.deleteExpLab(id);
    }
       
    
    @Autowired
    private IProyectoService proyeServ;
                
    @PostMapping ("/api/Proyecto/new")
    public void addProyecto(@RequestBody Proyecto y){
       proyeServ.crearProyecto(y);
    }
    
    @GetMapping ("/api/Proyecto/ver")
    @ResponseBody
    public List<Proyecto> verProyecto (){
        return proyeServ.verProyecto();
    }
    
    @PutMapping ("/api/Proyecto/modificar")
    @ResponseBody
    public void modificarProyecto(@RequestBody Proyecto y){
        proyeServ.saveProyecto(y);
    }
    
    @DeleteMapping ("/api/Proyecto/delete/{id}")
    public void deleteProyecto (@PathVariable Long id) {
        proyeServ.deleteProyecto(id);
    }
        
    
    @Autowired
    private ITecnologiaService tecnoServ;
                
    @PostMapping ("/api/Tecnologia/new")
    public void addTecnologia(@RequestBody Tecnologia t){
       tecnoServ.crearTecnologia(t);
    }
    
    @GetMapping ("/api/Tecnologia/ver")
    @ResponseBody
    public List<Tecnologia> verTecnologia (){
        return tecnoServ.verTecnologia();
    }
    
    @PutMapping ("/api/Tecnologia/modificar")
    @ResponseBody
    public void modificarTecnologia(@RequestBody Tecnologia t){
        tecnoServ.saveTecnologia(t);
    }
    
    @DeleteMapping ("/api/Tecnologia/delete/{id}")
    public void deleteTecnologia (@PathVariable Long id) {
        tecnoServ.deleteTecnologia(id);
    }
       
    
    @Autowired
    private UserRepository UserRepository;
    
    @GetMapping ("/api/User/{id}")
    @ResponseBody
    public User usuario(@PathVariable Long id){
        return (UserRepository.findById(id).get());
    }
    
    @GetMapping("api/User/username")
    @ResponseBody
    public User usuario(){
        return (UserRepository.findByUsername("Natalia Schwindt"));
    }
    
    @PostMapping("/api/User/login")
    @ResponseBody
    public User login(@RequestBody User u){
        return (UserRepository.findByUsernameAndPassword(u.getUsername(), u.getPassword()));
    }
    
    @Autowired
    private IUserService userServ;
    
    @PostMapping ("/api/User/add")
    public void addUser(@RequestBody User u){
        userServ.crearUser(u);
    }
    
    @PutMapping("/api/User/edit")
    @ResponseBody
    public void modificarUser(@RequestBody User u){
        userServ.saveUser(u);
    }
        
    @DeleteMapping("/api/User/delete/{id}")
    public void deleteUser(@PathVariable Long id){
        userServ.deleteUser(id);
    }
}