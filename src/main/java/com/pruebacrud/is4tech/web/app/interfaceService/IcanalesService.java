package com.pruebacrud.is4tech.web.app.interfaceService;

import com.pruebacrud.is4tech.web.app.models.Canales;

import java.util.List;
import java.util.Optional;

public interface IcanalesService {
    public List<Canales> listar();
    public Optional<Canales> listarCodigo(int codigo);
    public int save(Canales c);
    public void delete(int codigo);
}
