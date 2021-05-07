package com.pruebacrud.is4tech.web.app.services;

import com.pruebacrud.is4tech.web.app.interfaceService.IcanalesService;
import com.pruebacrud.is4tech.web.app.interfaces.ICanales;
import com.pruebacrud.is4tech.web.app.models.Canales;
import com.pruebacrud.is4tech.web.app.models.Productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class canalesService implements IcanalesService {

    @Autowired
    private ICanales datacanales;

    @Override
    public List<Canales> listar() {
        return (List<Canales>)datacanales.findAll();
    }

    @Override
    public Optional<Canales> listarCodigo(int codigo) {
        return datacanales.findById(codigo);
    }

    @Override
    public int save(Canales c) {
        int res=0;
        Canales canales = datacanales.save(c);
        if (canales != null){
            res=1;
        }
        return res;
    }

    @Override
    public void delete(int codigo) {

        datacanales.deleteById(codigo);
    }
}
