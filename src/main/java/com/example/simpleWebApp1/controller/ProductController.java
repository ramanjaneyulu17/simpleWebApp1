package com.example.simpleWebApp1.controller;

import com.example.simpleWebApp1.model.Products;
import com.example.simpleWebApp1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/greet")
    public String greet(){
        return "Hello World";
    }

    @Autowired
     ProductService service;

    @GetMapping("/products")
    public List<Products> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/products/{productId}")
    public Products getProductsById(@PathVariable int productId){
        return service.getProductById(productId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Products product){
        service.addProduct(product);
    }

    @PutMapping("/products")
    public String  updateProduct(@RequestBody Products product){
        service.updateProduct(product);
        return "Updated the product.";
    }

    @DeleteMapping("/products/{productId}")
    public String deleteProduct(@PathVariable int productId){
        service.deleteProduct(productId);
        return  "Deleted one product.";
    }

}
