package com.actividad.actividad.controller;

import com.actividad.actividad.model.Producto;
import com.actividad.actividad.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/productos") // Asegúrate de que no haya typos aquí
public class ProductoController {

    private final ProductoService productoService;

    @Autowired
    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @PostMapping
    public Producto crearProducto(@RequestBody Producto producto) {
        return productoService.guardarProducto(producto);
    }

    @GetMapping
    public List<Producto> listarProductos() { // Corregido: "listarProductos"
        return productoService.listarTodos();
    }

    @GetMapping("/{id}")
    public Producto obtenerProducto(@PathVariable Long id) { // Corregido: "obtenerProducto"
        return productoService.buscarPorId(id); // Asegúrate de que el método se llame "buscarPorId"
    }

    @GetMapping("/")
    public String inicio() {
        return "API de Productos funcionando correctamente"; // Sin typos en el mensaje
    }
}