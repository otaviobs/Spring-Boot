package com.products.apirest.repository.resources;

import java.util.List;

import com.products.apirest.models.Product;
import com.products.apirest.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(value="/api")
public class ProductResource {

  @Autowired
  ProductRepository productRepository;

  @GetMapping("/product")
  public List<Product> listProducts() {
      return productRepository.findAll();
  }
  
  @GetMapping("/product/{id}")
  public Product listaProdutoUnico(@PathVariable(value="id") long id) {
      return productRepository.findById(id);
  }

  @PostMapping("/product")
  public Product saveProduct(@RequestBody Product product){
    return productRepository.save(product);
  }
}