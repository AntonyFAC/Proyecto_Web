package com.aplicativo.app.repository;

import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aplicativo.app.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String>{
    
}
