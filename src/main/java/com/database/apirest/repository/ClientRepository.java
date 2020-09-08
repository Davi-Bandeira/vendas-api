package com.database.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.database.apirest.models.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{
	Client findById(long id);
	Client deleteById(long id);
}
