package com.database.apirest.resources;

import java.util.List;

import com.database.apirest.models.Client;
import com.database.apirest.repository.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/clients")

public class ClientResource {
	
	@Autowired
	ClientRepository clientRepository;
	
	@GetMapping
	public List<Client> listClients(){
		return clientRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Client listClient(@PathVariable(value="id") long id){
		return clientRepository.findById(id);
	}
	
	@PostMapping
	public Client saveClient(@RequestBody Client client) {
		return clientRepository.save(client);
    }
    
	
	@DeleteMapping("/{id}")
	public void deleteClient(@PathVariable(value="id") long id){
		clientRepository.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public Client updateClient(@PathVariable(value="id") long id, @RequestBody Client client) {
		return clientRepository.save(client);
	}
}
