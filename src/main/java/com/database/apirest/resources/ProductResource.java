package com.database.apirest.resources;

import java.util.List;

import com.database.apirest.models.Product;
import com.database.apirest.repository.ProductRepository;

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
@RequestMapping("/products")
public class ProductResource {
	
	@Autowired
	ProductRepository productRepository;
	
	@GetMapping
	public List<Product> listProducts(){
		return productRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Product listProduct(@PathVariable(value="id") long id){
		return productRepository.findById(id);
	}
	
	@PostMapping
	public Product saveProduct(@RequestBody Product product) {
		return productRepository.save(product);
    }
    
	
	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable(value="id") long id) {
		productRepository.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public Product updateProduct(@PathVariable(value="id") long id, @RequestBody Product product) {
		return productRepository.save(product);
	}
}
