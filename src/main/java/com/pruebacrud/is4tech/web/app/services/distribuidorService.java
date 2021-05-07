package com.pruebacrud.is4tech.web.app.services;

import com.pruebacrud.is4tech.web.app.interfaceService.IdistribuidorService;
import com.pruebacrud.is4tech.web.app.interfaces.IDistribuidor;
import com.pruebacrud.is4tech.web.app.models.Distribuidor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class distribuidorService implements IdistribuidorService {

    @Autowired
    private IDistribuidor data;

    @Override
    public List<Distribuidor> listar() {
        return (List<Distribuidor>) data.findAll();
    }

    @Override
    public Optional<Distribuidor> listarCodigo(int codigo) {
        return data.findById(codigo);
    }

    @Override
    public int save(Distribuidor d) {
        int res=0;
        Distribuidor distribuidores = data.save(d);
        if (distribuidores != null){
            res=1;
        }
        return res;
    }

    @Override
    public void delete(int codigo) {

        data.deleteById(codigo);
    }
}
