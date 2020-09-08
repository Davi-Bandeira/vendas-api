package com.database.apirest.resources;

import java.util.List;

import com.database.apirest.models.Sale;
import com.database.apirest.repository.SaleRepository;

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
@RequestMapping("/sales")

public class SaleResource {
	
	@Autowired
	SaleRepository saleRepository;
	
	@GetMapping
	public List<Sale> listClients(){
		return saleRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Sale listSale(@PathVariable(value="id") long id){
		return saleRepository.findById(id);
	}
	
	@PostMapping
	public Sale saveSale(@RequestBody Sale sale) {
		return saleRepository.save(sale);
    }
    
	
	@DeleteMapping("/{id}")
	public void deleteSale(@PathVariable(value="id") long id) {
		saleRepository.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public Sale updateSale(@PathVariable(value="id") long id, @RequestBody Sale sale) {
		return saleRepository.save(sale);
	}
}
