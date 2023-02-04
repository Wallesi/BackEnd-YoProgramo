package com.portfolio.yoProgramo.controller;

import com.portfolio.yoProgramo.Dto.dtoExperiencialab;
import com.portfolio.yoProgramo.entity.Experiencialab;
import com.portfolio.yoProgramo.security.controller.Mensaje;
import com.portfolio.yoProgramo.service.SExperiencialab;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("experiencia")
@CrossOrigin(origins="https://frontwaldemar.web.app")
public class CExperiencialab {
    @Autowired
    SExperiencialab sExperiencialab;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Experiencialab>> list(){
        List<Experiencialab> list = sExperiencialab.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Experiencialab> getById(@PathVariable("id") int id){
        if(!sExperiencialab.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Experiencialab experiencialab = sExperiencialab.getOne(id).get();
        return new ResponseEntity(experiencialab, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sExperiencialab.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        sExperiencialab.delete(id);
        return new ResponseEntity(new Mensaje("Experiencia eliminado"), HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoExperiencialab dtoexpe){      
        if(StringUtils.isBlank(dtoexpe.getPuesto()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(sExperiencialab.existsByPuesto(dtoexpe.getPuesto()))
            return new ResponseEntity(new Mensaje("Esa experiencia existe"), HttpStatus.BAD_REQUEST);
        
                Experiencialab experiencialab = new Experiencialab(
                dtoexpe.getPuesto(),
                dtoexpe.getEmpresa(),
                dtoexpe.getComienzo(),
                dtoexpe.getFinalizo(),
                dtoexpe.getTareas());
                
        sExperiencialab.save(experiencialab);
        
        return new ResponseEntity(new Mensaje("Experiencia agregada"), HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoExperiencialab dtoexpe){
        //Validamos si existe el ID
        if(!sExperiencialab.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        //Compara nombre de experiencias
        if(sExperiencialab.existsByPuesto(dtoexpe.getPuesto()) && sExperiencialab.getByPuesto(dtoexpe.getPuesto()).get().getId() != id)
            return new ResponseEntity(new Mensaje("Esa experiencia ya existe"), HttpStatus.BAD_REQUEST);
        //No puede estar vacio
        if(StringUtils.isBlank(dtoexpe.getPuesto()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Experiencialab experiencialab = sExperiencialab.getOne(id).get();
        
        experiencialab.setPuesto(dtoexpe.getPuesto());
        experiencialab.setEmpresa(dtoexpe.getEmpresa());
        experiencialab.setComienzo(dtoexpe.getComienzo());
        experiencialab.setFinalizo(dtoexpe.getFinalizo());
        experiencialab.setTareas(dtoexpe.getTareas());
        sExperiencialab.save(experiencialab);
        
        
        return new ResponseEntity(new Mensaje("Experiencia actualizada"), HttpStatus.OK);
    }
    
}
