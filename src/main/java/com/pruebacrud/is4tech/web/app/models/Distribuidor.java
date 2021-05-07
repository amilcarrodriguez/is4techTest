package com.pruebacrud.is4tech.web.app.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "distribuidor")
public class Distribuidor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    private String nombre;
    private String correonotificacion;
    private String correoalerta;

    @OneToMany(mappedBy = "distribuidor")
    private List<Canales>canales;


    public Distribuidor() {
    }

    public Distribuidor(int codigo, String nombre, String correonotificacion, String correoalerta, List<Canales> canales) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.correonotificacion = correonotificacion;
        this.correoalerta = correoalerta;
        this.canales = canales;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreonotificacion() {
        return correonotificacion;
    }

    public void setCorreonotificacion(String correonotificacion) {
        this.correonotificacion = correonotificacion;
    }

    public String getCorreoalerta() {
        return correoalerta;
    }

    public void setCorreoalerta(String correoalerta) {
        this.correoalerta = correoalerta;
    }

    public List<Canales> getCanales() {
        return canales;
    }

    public void setCanales(List<Canales> canales) {
        this.canales = canales;
    }
}
