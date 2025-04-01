package com.actividad.actividad.controller;

import com.actividad.actividad.model.Producto;
import com.actividad.actividad.service.ProductoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.test.StepVerifier;

@SpringBootTest
public class ProductoServiceTest {
    @Autowired
    private ProductoService productoService;

    @Test
    void testGuardarProducto() {
        Producto producto = new Producto("Laptop", 999.99);
        StepVerifier.create(productoService.guardarProducto(producto))
                .expectNextMatches(p -> p.getNombre().equals("Laptop"))
                .verifyComplete();
    }
}