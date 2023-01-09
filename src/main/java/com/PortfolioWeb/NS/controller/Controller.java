package com.PortfolioWeb.NS.controller;

import com.PortfolioWeb.NS.model.Educacion;
import com.PortfolioWeb.NS.model.ExpLab;
import com.PortfolioWeb.NS.model.Persona;
import com.PortfolioWeb.NS.model.Proyecto;
import com.PortfolioWeb.NS.model.Tecnologia;
import com.PortfolioWeb.NS.model.User;
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
                
    @PostMapping ("/new/Persona")
    public void addPersona(@RequestBody Persona p){
       persoServ.crearPersona(p);
    }
    
    @GetMapping ("/ver/Personas")
    @ResponseBody
    public List<Persona> verPersonas (){
        return persoServ.verPersonas();
    }
    
    @DeleteMapping ("/delete/Persona/{id}")
    public void deletePersona (@PathVariable Long id) {
        persoServ.deletePersona(id);
    }
    
    @PutMapping ("/modificar/Persona")
    @ResponseBody
    public void modificarPersona(@RequestBody Persona p){
        persoServ.savePersona(p);
    }
    @Autowired
    private IEducacionService educaServ;
                
    @PostMapping ("/new/Educacion")
    public void addEducacion(@RequestBody Educacion e){
       educaServ.crearEducacion(e);
    }
    
    @GetMapping ("/ver/Educacion")
    @ResponseBody
    public List<Educacion> verEducacion (){
        return educaServ.verEducacion();
    }
    
    @DeleteMapping ("/delete/Educacion/{id}")
    public void deleteEducacion (@PathVariable Long id) {
        educaServ.deleteEducacion(id);
    }
    
    @PutMapping ("/modificar/Educacion")
    @ResponseBody
    public void modificarEducacion(@RequestBody Educacion e){
        educaServ.saveEducacion(e);
    }
    
    @Autowired
    private IExpLabService expLabServ;
                
    @PostMapping ("/new/ExpLab")
    public void addExpLab(@RequestBody ExpLab l){
       expLabServ.crearExpLab(l);
    }
    
    @GetMapping ("/ver/ExpLab")
    @ResponseBody
    public List<ExpLab> verExpLab (){
        return expLabServ.verExpLab();
    }
    
    @DeleteMapping ("/delete/ExpLab/{id}")
    public void deleteExpLab (@PathVariable Long id) {
        expLabServ.deleteExpLab(id);
    }
    
    @PutMapping ("/modificar/ExpLab")
    @ResponseBody
    public void modificarExpLab(@RequestBody ExpLab l){
        expLabServ.saveExpLab(l);
    }
    @Autowired
    private IProyectoService proyecServ;
                
    @PostMapping ("/new/Proyecto")
    public void addProyecto(@RequestBody Proyecto y){
       proyecServ.crearProyecto(y);
    }
    
    @GetMapping ("/ver/Proyecto")
    @ResponseBody
    public List<Proyecto> verProyecto (){
        return proyecServ.verProyecto();
    }
    
    @DeleteMapping ("/delete/Proyecto/{id}")
    public void deleteProyecto (@PathVariable Long id) {
        proyecServ.deleteProyecto(id);
    }
    
    @PutMapping ("/modificar/Proyecto")
    @ResponseBody
    public void modificarProyecto(@RequestBody Proyecto y){
        proyecServ.saveProyecto(y);
    }
    
    @Autowired
    private ITecnologiaService tecnocServ;
                
    @PostMapping ("/new/Tecnologia")
    public void addTecnologia(@RequestBody Tecnologia t){
       tecnocServ.crearTecnologia(t);
    }
    
    @GetMapping ("/ver/Tecnologia")
    @ResponseBody
    public List<Tecnologia> verTecnologia (){
        return tecnocServ.verTecnologia();
    }
    
    @DeleteMapping ("/delete/Tecnologia/{id}")
    public void deleteTecnologia (@PathVariable Long id) {
        tecnocServ.deleteTecnologia(id);
    }
    
    @PutMapping ("/modificar/Tecnologia")
    @ResponseBody
    public void modificarTecnologia(@RequestBody Tecnologia t){
        tecnocServ.saveTecnologia(t);
    }
    @Autowired
    private IUserService userServ;
                
    @PostMapping ("/new/User")
    public void addUser(@RequestBody User u){
       userServ.crearUser(u);
    }
    
    @GetMapping ("/ver/User")
    @ResponseBody
    public List<User> verUser (){
        return userServ.verUser();
    }
    
    @DeleteMapping ("/delete/User/{id}")
    public void deleteUser (@PathVariable Long id) {
        userServ.deleteUser(id);
    }
    
    @PutMapping ("/modificar/User")
    @ResponseBody
    public void modificarUser(@RequestBody User u){
        userServ.saveUser(u);
    }
    
}