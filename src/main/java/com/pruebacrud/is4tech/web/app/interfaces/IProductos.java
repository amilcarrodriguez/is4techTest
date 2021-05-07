package com.pruebacrud.is4tech.web.app.interfaces;

import com.pruebacrud.is4tech.web.app.models.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductos extends JpaRepository<Productos,Integer> {
}
