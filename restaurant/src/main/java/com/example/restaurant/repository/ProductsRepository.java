package com.example.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restaurant.model.Products;

public interface ProductsRepository extends JpaRepository<Products, Integer> {

}
