package com.proyecto.tucomunidad.entidades;

import com.proyecto.tucomunidad.Enumeraciones.Estado;
import com.proyecto.tucomunidad.entidades.Comunidad;
import com.proyecto.tucomunidad.entidades.Foto;
import com.proyecto.tucomunidad.entidades.Usuario;
import com.proyecto.tucomunidad.entidades.Votacion;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Proyecto {
//ENTITIES

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String nombre;
    private String descripcion;
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @ManyToOne
    private Usuario responsable;
    @ManyToMany
    private List<Foto> fotoProgreso;
    @Enumerated(EnumType.STRING)
    private Estado estado;
    @OneToMany
    private List<Votacion> votacion;
    @ManyToOne
    private Comunidad comunidad;
    @OneToOne
    private Foto fotoInicio;
    
    @OneToMany
    private List<Comentario>comentarios; 

//CONTRUCTOR
    public Proyecto() {
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Usuario getResponsable() {
        return responsable;
    }

    public void setResponsable(Usuario responsable) {
        this.responsable = responsable;
    }

    public List<Foto> getFotoProgreso() {
        return fotoProgreso;
    }

    public void setFotoProgreso(List<Foto> fotoProgreso) {
        this.fotoProgreso = fotoProgreso;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public List<Votacion> getVotacion() {
        return votacion;
    }

    public void setVotacion(List<Votacion> votacion) {
        this.votacion = votacion;
    }

    public Comunidad getComunidad() {
        return comunidad;
    }

    public void setComunidad(Comunidad comunidad) {
        this.comunidad = comunidad;
    }

    public Foto getFotoInicio() {
        return fotoInicio;
    }

    public void setFoto(Foto fotoInicio) {
        this.fotoInicio = fotoInicio;
    }

    
    


}
