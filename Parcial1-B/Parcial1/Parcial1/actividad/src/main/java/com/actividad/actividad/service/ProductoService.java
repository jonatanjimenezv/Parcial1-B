package com.actividad.actividad.service;

import com.actividad.actividad.model.Producto;
import com.actividad.actividad.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {
    private final ProductoRepository productoRepository;

    @Autowired
    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    // Método para guardar un producto
    public Producto guardarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    // Método para listar todos los productos
    public List<Producto> listarTodos() {
        return productoRepository.findAll();
    }

    // Método para buscar un producto por ID
    public Producto buscarPorId(Long id) {
        Optional<Producto> producto = productoRepository.findById(id);
        return producto.orElse(null); // Devuelve null si no existe
    }
}