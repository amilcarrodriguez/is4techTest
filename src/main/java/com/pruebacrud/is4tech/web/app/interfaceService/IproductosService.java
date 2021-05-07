package com.pruebacrud.is4tech.web.app.interfaceService;

import com.pruebacrud.is4tech.web.app.models.Productos;

import java.util.List;
import java.util.Optional;

public interface IproductosService {
    public List<Productos> listar();
    public Optional<Productos> listarCodigo(int codigo);
    public int save(Productos p);
    public void delete(int codigo);
}
