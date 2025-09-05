package com.example.demoPractico.controller;

import com.example.demoPractico.repository.Product;
import com.example.demoPractico.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("product/{id}")
    public Product buscarProducto(@PathVariable("id") long id){
        if(id>0){
            return productService.buscarProducto(id);
        }
        return null;
    }
    //lista
    @GetMapping
    public List<Product> listar(){
        return productService.listarProductos();
    }
}
