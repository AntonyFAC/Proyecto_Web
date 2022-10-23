package com.aplicativo.app.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;
import com.aplicativo.app.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    @Query(value = "SELECT o FROM Producto o WHERE o.status='A'")
    List<Producto> getAllActiveProductos();

    @Query(value = "SELECT o FROM Producto o WHERE o.descripcion LIKE  %:searchName% And o.status='A'")
    List<Producto> getAllActiveProductosBySearch(@Param("searchName") String searchName);
}
