package com.proyecto.tucomunidad.Repositorios;

import com.proyecto.tucomunidad.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepo extends JpaRepository <Usuario, String>{
    
}
