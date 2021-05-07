package com.pruebacrud.is4tech.web.app.interfaceService;

import com.pruebacrud.is4tech.web.app.models.Distribuidor;

import java.util.List;
import java.util.Optional;

public interface IdistribuidorService {
    public List<Distribuidor> listar();
    public Optional<Distribuidor> listarCodigo(int codigo);
    public int save(Distribuidor d);
    public void delete(int codigo);
}
