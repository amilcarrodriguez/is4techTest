package com.pruebacrud.is4tech.web.app.models;

import javax.persistence.*;

@Entity
@Table(name = "productos")
public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    private String descripcion;
    private int monto;

    @ManyToOne
    private Canales canales;

    public Productos() {
    }

    public Productos(int codigo, String descripcion, int monto, Canales canales) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.monto = monto;
        this.canales = canales;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Canales getCanales() {
        return canales;
    }

    public void setCanales(Canales canales) {
        this.canales = canales;
    }
}
