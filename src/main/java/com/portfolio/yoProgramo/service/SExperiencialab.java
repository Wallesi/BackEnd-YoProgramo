/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.yoProgramo.service;

import com.portfolio.yoProgramo.entity.Experiencialab;
import com.portfolio.yoProgramo.repository.RExperiencialab;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencialab {
    @Autowired
    RExperiencialab rExperiencialab;
    
    public List<Experiencialab> list(){
        return rExperiencialab.findAll();
    }
    
    public Optional<Experiencialab> getOne(int id){
        return rExperiencialab.findById(id);
    }
    
    public Optional<Experiencialab> getByPuesto(String puesto){
        return rExperiencialab.findByPuesto(puesto);
    }
    
    public void save(Experiencialab edu){
        rExperiencialab.save(edu);
    }
    
    public void delete(int id){
        rExperiencialab.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rExperiencialab.existsById(id);
    }
    
    public boolean existsByPuesto(String puesto){
        return rExperiencialab.existsByPuesto(puesto);
    }
}
