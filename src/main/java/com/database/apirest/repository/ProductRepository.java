package com.database.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.database.apirest.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	Product findById(long id);
}
