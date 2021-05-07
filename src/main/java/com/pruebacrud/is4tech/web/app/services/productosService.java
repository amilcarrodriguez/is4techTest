package com.pruebacrud.is4tech.web.app.services;

import com.pruebacrud.is4tech.web.app.interfaceService.IproductosService;
import com.pruebacrud.is4tech.web.app.interfaces.IProductos;
import com.pruebacrud.is4tech.web.app.models.Distribuidor;
import com.pruebacrud.is4tech.web.app.models.Productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class productosService implements IproductosService {

    @Autowired
    private IProductos dataproductos;

    @Override
    public List<Productos> listar() {
        return (List<Productos>) dataproductos.findAll();
    }

    @Override
    public Optional<Productos> listarCodigo(int codigo) {
        return dataproductos.findById(codigo);
    }

    @Override
    public int save(Productos p) {
        int res=0;
        Productos productos = dataproductos.save(p);
        if (productos != null){
            res=1;
        }
        return res;
    }

    @Override
    public void delete(int codigo) {

        dataproductos.deleteById(codigo);
    }
}
