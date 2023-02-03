package com.portfolio.yoProgramo.repository;

import com.portfolio.yoProgramo.entity.Habilidades;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RHabilidades extends JpaRepository <Habilidades,Integer> {
       public Optional<Habilidades> findByName(String name);
       public boolean existsByName(String name); 
}
