package com.example.demoPractico.service;

import com.example.demoPractico.repository.Product;
import com.example.demoPractico.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    Logger log = LoggerFactory.getLogger(ProductService.class);
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    //
    public Product buscarProducto(long id){
        log.info("aqui estamos retornando uno ");
        //return this.productRepository.findById(id);
        return this.productRepository.findById(id);
        //return productRepository.findById(id).orElse(null);
    }
    //
    public List<Product> listarProductos(){
        return productRepository.findAll();
    }

}
