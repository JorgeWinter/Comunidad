package com.proyecto.tucomunidad.Repositorios;

import com.proyecto.tucomunidad.entidades.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepo extends JpaRepository <Proyecto, String> {
    
}
