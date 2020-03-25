package com.products.apirest.resources;

import java.util.List;

import com.products.apirest.models.Product;
import com.products.apirest.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(value="/api")
@Api(value="API REST Products")
@CrossOrigin(origins="*") // Allowed every domines can to access
public class ProductResource {

  @Autowired
  ProductRepository productRepository;

  @GetMapping("/product")
  @ApiOperation(value="Return a list of product")
  public List<Product> listProducts() {
      return productRepository.findAll();
  }
  
  @GetMapping("/product/{id}")
  @ApiOperation(value="Return a unique product")
  public Product listaProdutoUnico(@PathVariable(value="id") long id) {
      return productRepository.findById(id);
  }

  @PostMapping("/product")
  @ApiOperation(value="Return save a product")
  public Product saveProduct(@RequestBody Product product){
    return productRepository.save(product);
  }

  @DeleteMapping("/product")
  @ApiOperation(value="Return delete a product")
  public void deleteProduct(@RequestBody Product product){
    productRepository.delete(product);
  }

  @PutMapping("/product")
  @ApiOperation(value="Return update a product")
  public Product updateProduct(@RequestBody Product product){
    return productRepository.save(product);
  }
}