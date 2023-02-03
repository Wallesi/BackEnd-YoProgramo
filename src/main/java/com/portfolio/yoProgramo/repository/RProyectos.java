/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.yoProgramo.repository;

import com.portfolio.yoProgramo.entity.Proyectos;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author walde
 */
public interface RProyectos extends JpaRepository <Proyectos,Integer> {
     public Optional<Proyectos> findByTitulo(String titulo);
       public boolean existsByTitulo(String titulo); 
}
