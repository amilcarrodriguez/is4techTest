package com.pruebacrud.is4tech.web.app.interfaces;

import com.pruebacrud.is4tech.web.app.models.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarios extends JpaRepository<Usuarios,Integer> {
}
