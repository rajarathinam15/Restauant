package com.example.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restaurant.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {

}
