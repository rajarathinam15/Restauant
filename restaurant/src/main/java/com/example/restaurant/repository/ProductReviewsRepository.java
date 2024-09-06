package com.example.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restaurant.model.ProductReviews;

public interface ProductReviewsRepository extends JpaRepository<ProductReviews, Integer> {

}
