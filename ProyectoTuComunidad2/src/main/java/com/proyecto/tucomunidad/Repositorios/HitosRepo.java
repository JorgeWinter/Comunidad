
package com.proyecto.tucomunidad.Repositorios;

import com.proyecto.tucomunidad.entidades.Hitos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HitosRepo extends JpaRepository <Hitos, String> {
    
}
