package com.example.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restaurant.model.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {

}
