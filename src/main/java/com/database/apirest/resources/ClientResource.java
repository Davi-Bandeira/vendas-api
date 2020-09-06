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

@RestController
@RequestMapping(value="/api")
@CrossOrigin("/clients")
public class ClientResource {
	
	@Autowired
	ClientRepository clientRepository;
	
	@GetMapping("/clients")
	public List<Client> listClients(){
		return clientRepository.findAll();
	}
	
	@GetMapping("/clients/{id}")
	public Client listClient(@PathVariable(value="id") long id){
		return clientRepository.findById(id);
	}
	
	@PostMapping("/clients")
	public Client saveClient(@RequestBody Client client) {
		return clientRepository.save(client);
    }
    
	
	@DeleteMapping("/clients")
	public void deleteClient(@RequestBody Client client) {
		clientRepository.delete(client);
	}
	
	@PutMapping("/clients")
	public Client updateClient(@RequestBody Client client) {
		return clientRepository.save(client);
	}
}
