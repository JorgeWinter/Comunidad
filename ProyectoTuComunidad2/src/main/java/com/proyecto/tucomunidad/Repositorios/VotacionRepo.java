package com.proyecto.tucomunidad.Repositorios;

import com.proyecto.tucomunidad.entidades.Votacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VotacionRepo extends JpaRepository <Votacion, String> {
    
}
