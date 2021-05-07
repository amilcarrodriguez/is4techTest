package com.pruebacrud.is4tech.web.app.interfaceService;

import com.pruebacrud.is4tech.web.app.models.Usuarios;

import java.util.List;
import java.util.Optional;

public interface IusuariosService {
    public List<Usuarios>listar();
    public Optional<Usuarios>listarCodigo(int codigo);
    public int save(Usuarios u);
    public void delete(int codigo);



}
