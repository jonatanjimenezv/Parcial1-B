package com.actividad.actividad.service;

import com.actividad.actividad.model.Producto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Mono;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureWebTestClient
public class ProductoIntegrationTest {  // Nombre corregido
    @Autowired
    private WebTestClient webTestClient;

    @Test
    void testCrearProducto() {  // Nombre corregido
        Producto producto = new Producto("Teclado", 49.99);
        webTestClient.post()
                .uri("/productos")
                .body(Mono.just(producto), Producto.class)
                .exchange()
                .expectStatus().isOk();
    }
}