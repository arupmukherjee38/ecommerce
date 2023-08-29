package com.tcs.library.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.library.ecommerce.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
