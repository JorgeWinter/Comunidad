package com.proyecto.tucomunidad.entidades;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Comunidad {
//ENTITIES

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String nombre;
    private String ciudad;
    private String pais;
    
    @ManyToMany
    private List<Usuario> administrador;

//Contructor
    public Comunidad() {
    }

//GET & SET
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public List<Usuario> getAdministrador() {
        return administrador;
    }

    public void setAdministrador(List<Usuario> administrador) {
        this.administrador = administrador;
    }

//TOSTRING
    @Override
    public String toString() {
        return "Comunidad{" + "id=" + id + ", nombre=" + nombre + ", ciudad=" + ciudad + ", pais=" + pais + ", administrador=" + administrador + '}';
    }

}
