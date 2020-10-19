package com.proyecto.tucomunidad.Repositorios;

import com.proyecto.tucomunidad.entidades.Comunidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComunidadRepo extends JpaRepository<Comunidad, String> {

}
