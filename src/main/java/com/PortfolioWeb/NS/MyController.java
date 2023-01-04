package com.PortfolioWeb.NS;

import com.PortfolioWeb.NS.dao.EducacionDao;
import com.PortfolioWeb.NS.dao.ExperienciaLaboralDao;
import com.PortfolioWeb.NS.dao.PersonaDao;
import com.PortfolioWeb.NS.dao.ProyectoDao;
import com.PortfolioWeb.NS.dao.TecnologiaDao;
import com.PortfolioWeb.NS.dao.UserDao;
import com.PortfolioWeb.NS.entity.Educacion;
import com.PortfolioWeb.NS.entity.ExperienciaLaboral;
import com.PortfolioWeb.NS.entity.Persona;
import com.PortfolioWeb.NS.entity.Proyecto;
import com.PortfolioWeb.NS.entity.Tecnologia;
import com.PortfolioWeb.NS.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    
    @Autowired
    private UserDao Userdao;
     
    @PostMapping ("/api/addUser")
    public void addUser(@RequestBody User u){
            Userdao.save(u);
    }
    
    @PutMapping ("/api/updateUser")
    @ResponseBody
    public void updateUser(@RequestBody User u){
            Userdao.save(u);
    }
    
    @DeleteMapping ("/api/deleteUser")
    @ResponseBody
    public void deleteUser(@RequestBody User u){
            Userdao.delete(u);
    };
    
    @Autowired
    private EducacionDao Educaciondao;
    
    @PostMapping ("/api/addEducacion")
    public void addEducacion(@RequestBody Educacion e){
            Educaciondao.save(e);
    }
    
    @PutMapping ("/api/updateEducacion")
    @ResponseBody
    public void updateEducacion(@RequestBody Educacion e){
            Educaciondao.save(e);
    }
    
    @DeleteMapping ("/api/deleteEducacion")
    @ResponseBody
    public void deleteEducacion(@RequestBody Educacion e){
            Educaciondao.delete(e);
    };
    
    @Autowired
    private ExperienciaLaboralDao ExperienciaLaboraldao;
    
    @PostMapping ("/api/addExperiencialaboral")
    public void addExperiencLalaboral(@RequestBody ExperienciaLaboral l){
            ExperienciaLaboraldao.save(l);
    }
    
    @PutMapping ("/api/updateExperiencialaboral")
    @ResponseBody
    public void updateExperienciaLaboral(@RequestBody ExperienciaLaboral l){
            ExperienciaLaboraldao.save(l);
    }
    
    @DeleteMapping ("/api/deleteExperiencialaboral")
    @ResponseBody
    public void deleteExperienciaLaboral(@RequestBody ExperienciaLaboral l){
            ExperienciaLaboraldao.delete(l);
    };
    
    @Autowired
    private PersonaDao Personadao;
    
    @PostMapping ("/api/addPersona")
    public void addPersona(@RequestBody Persona p){
        Personadao.save(p);
    }
    
    @PutMapping ("/api/updatePersona")
    @ResponseBody
    public void updatePersona(@RequestBody Persona p){
        Personadao.save(p);
    }
    
    @DeleteMapping ("/api/deletePersona")
    @ResponseBody
    public void deletePersona(@RequestBody Persona p){
            Personadao.delete(p);
    };
    
    @Autowired
    private ProyectoDao Proyectodao;
    
    @PostMapping ("/api/addProyecto")
    public void addProyecto(@RequestBody Proyecto o){
        Proyectodao.save(o);
    }
    
    @PutMapping ("/api/updateProyecto")
    @ResponseBody
    public void updateProyecto(@RequestBody Proyecto o){
        Proyectodao.save(o);
    }
    
    @DeleteMapping ("/api/deleteProyecto")
    @ResponseBody
    public void deleteProyecto(@RequestBody Proyecto o){
            Proyectodao.delete(o);
    };
    
    @Autowired
    private TecnologiaDao Tecnologiadao;
    
    @PostMapping ("/api/addTecnologia")
    public void addTecnologia(@RequestBody Tecnologia t){
        Tecnologiadao.save(t);
    }
    
    @PutMapping ("/api/updateTecnologia")
    @ResponseBody
    public void updateTecnologia(@RequestBody Tecnologia t){
        Tecnologiadao.save(t);
    }
    
    @DeleteMapping ("/api/deleteTecnologia")
    @ResponseBody
    public void deleteTecnologia(@RequestBody Tecnologia t){
            Tecnologiadao.delete(t);
    };
}
