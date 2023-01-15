package com.company.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.company.product.model.Product;
import com.company.product.repository.ProductRepository;


@RestController
public class ProductController {

	@Autowired
	private ProductRepository repository;
	
	@GetMapping("product")
	@ResponseStatus(HttpStatus.OK)
	public List<Product> listAllProduct(){
		return repository.findAll();
	}
	
	@GetMapping("product/{id}")
	@ResponseStatus(HttpStatus.FOUND)
	public Product findProductById(@PathVariable Long id){
		return repository.findById(id).get();
	}
	
	@PostMapping("product")
	@ResponseStatus(HttpStatus.CREATED)
	public Product newProduct(@RequestBody Product product) {
		return repository.save(product);
	}
	
	@PutMapping("product/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Product editProduct(@PathVariable Long id, @RequestBody Product product) {
		return repository.save(product);
	}
	
	@DeleteMapping("product/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void deleteProduct(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
