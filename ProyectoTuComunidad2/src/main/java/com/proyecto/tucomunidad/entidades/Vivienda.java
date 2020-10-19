package com.proyecto.tucomunidad.entidades;

import com.proyecto.tucomunidad.Enumeraciones.ViviendaTipo;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Vivienda {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String claveVivienda;
    private String direccion;
    @ManyToOne
    private Comunidad comunidad;
    @Enumerated(EnumType.STRING)
    private ViviendaTipo tipo;
    
    @OneToMany
    private List<Foto> foto;
    
    private Boolean mascota;
    private Boolean duenoHabita;
    private Integer numeroHabitantes;

    public Vivienda() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClaveVivienda() {
        return claveVivienda;
    }

    public void setClaveVivienda(String claveVivienda) {
        this.claveVivienda = claveVivienda;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Comunidad getComunidad() {
        return comunidad;
    }

    public void setComunidad(Comunidad comunidad) {
        this.comunidad = comunidad;
    }

    public ViviendaTipo getTipo() {
        return tipo;
    }

    public void setTipo(ViviendaTipo tipo) {
        this.tipo = tipo;
    }

    public List<Foto> getFoto() {
        return foto;
    }

    public void setFoto(List<Foto> foto) {
        this.foto = foto;
    }

    public Boolean getMascota() {
        return mascota;
    }

    public void setMascota(Boolean mascota) {
        this.mascota = mascota;
    }

    public Boolean getDuenoHabita() {
        return duenoHabita;
    }

    public void setDuenoHabita(Boolean duenoHabita) {
        this.duenoHabita = duenoHabita;
    }

    public Integer getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(Integer numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }
}
