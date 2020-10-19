package com.proyecto.tucomunidad.Repositorios;

import com.proyecto.tucomunidad.entidades.Vivienda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViviendaRepo extends JpaRepository <Vivienda, String> {
    
}
