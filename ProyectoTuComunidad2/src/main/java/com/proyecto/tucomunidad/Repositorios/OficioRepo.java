package com.proyecto.tucomunidad.Repositorios;

import com.proyecto.tucomunidad.entidades.Oficio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OficioRepo extends JpaRepository <Oficio, String> {
    
}
