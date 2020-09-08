package com.database.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.database.apirest.models.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	Sale findById(long id);
	Sale deleteById(long id);
}
