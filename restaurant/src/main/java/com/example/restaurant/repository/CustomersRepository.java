package com.example.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restaurant.model.Customers;

public interface CustomersRepository extends JpaRepository<Customers, Integer> {

}
