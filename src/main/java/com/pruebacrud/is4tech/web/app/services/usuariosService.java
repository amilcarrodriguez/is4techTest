package com.pruebacrud.is4tech.web.app.services;

import com.pruebacrud.is4tech.web.app.interfaceService.IusuariosService;
import com.pruebacrud.is4tech.web.app.interfaces.IUsuarios;
import com.pruebacrud.is4tech.web.app.models.Productos;
import com.pruebacrud.is4tech.web.app.models.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class usuariosService implements IusuariosService {

    @Autowired
    private IUsuarios datausuarios;

    @Override
    public List<Usuarios> listar() {
        return (List<Usuarios>) datausuarios.findAll();
    }

    @Override
    public Optional<Usuarios> listarCodigo(int codigo) {
        return datausuarios.findById(codigo);
    }

    @Override
    public int save(Usuarios u) {
        int res=0;
        Usuarios usuarios = datausuarios.save(u);
        if (usuarios != null){
            res=1;
        }

        return res;
    }

    @Override
    public void delete(int codigo) {

        datausuarios.deleteById(codigo);
    }
}
