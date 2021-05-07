package com.pruebacrud.is4tech.web.app.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "canales")
public class Canales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    private String nombre;

    @ManyToOne
    private Distribuidor distribuidor;

    @OneToMany(mappedBy = "canales")
    List<Productos>productos;

    public Canales() {
    }

    public Canales(int codigo, String nombre, Distribuidor distribuidor, List<Productos> productos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.distribuidor = distribuidor;
        this.productos = productos;
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

    public Distribuidor getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(Distribuidor distribuidor) {
        this.distribuidor = distribuidor;
    }

    public List<Productos> getProductos() {
        return productos;
    }

    public void setProductos(List<Productos> productos) {
        this.productos = productos;
    }
}
