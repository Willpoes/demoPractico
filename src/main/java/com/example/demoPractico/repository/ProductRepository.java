package com.example.demoPractico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    //generacion mas manual
    Product findById(long id);
    //List<Product> findByPrecioGreaterThan(double precioTarget);
    List<Product> findByPrecioGreaterThan(double precioTarget);

}
