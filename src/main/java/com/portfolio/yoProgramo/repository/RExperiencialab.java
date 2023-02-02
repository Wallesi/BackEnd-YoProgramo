
package com.portfolio.yoProgramo.repository;

import com.portfolio.yoProgramo.entity.Experiencialab;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperiencialab extends JpaRepository <Experiencialab,Integer>{
    public Optional<Experiencialab> findByPuesto(String puesto);
       public boolean existsByPuesto(String puesto);
}
