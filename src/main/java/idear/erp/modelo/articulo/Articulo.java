package idear.erp.modelo.articulo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

import java.util.Date;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "articulos")
public class Articulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String descripcion;

    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    @Column(name = "fecha_ultima_actualizacion")
    private Date fechaUltimaActualizacion;

    private int cantidad;

    @Column(name = "es_envase")
    private Boolean esEnvase;

    @Column(name = "id_iva")
    private Long idIva;

    public Articulo() {}

    public Articulo(String nombre, String descripcion, Date fechaCreacion, Date fechaUltimaActualizacion, int cantidad, Boolean esEnvase, Long idIva) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.fechaUltimaActualizacion = fechaUltimaActualizacion;
        this.cantidad = cantidad;
        this.esEnvase = esEnvase;
        this.idIva = idIva;
    }

    // Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaUltimaActualizacion() {
        return fechaUltimaActualizacion;
    }

    public void setFechaUltimaActualizacion(Date fechaUltimaActualizacion) {
        this.fechaUltimaActualizacion = fechaUltimaActualizacion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Boolean getEsEnvase() {
        return esEnvase;
    }

    public void setEsEnvase(Boolean esEnvase) {
        this.esEnvase = esEnvase;
    }

    public Long getIdIva() {
        return idIva;
    }

    public void setIdIva(Long idIva) {
        this.idIva = idIva;
    }
}
