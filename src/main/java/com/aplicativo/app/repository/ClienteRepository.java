package com.aplicativo.app.repository;

import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.aplicativo.app.model.Cliente;
import com.aplicativo.app.model.Usuario;

@Repository
public interface  ClienteRepository extends JpaRepository<Cliente, Integer>{
    @Query(value = "SELECT o FROM Cliente o WHERE o.user=?1")
    Cliente findByUsuario(Usuario user);
}
