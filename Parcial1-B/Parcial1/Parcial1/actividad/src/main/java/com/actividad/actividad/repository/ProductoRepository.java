package com.actividad.actividad.repository;

import com.actividad.actividad.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // Métodos como findAll() y findById() ya están definidos por JpaRepository
}