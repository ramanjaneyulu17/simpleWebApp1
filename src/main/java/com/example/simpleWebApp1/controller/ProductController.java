package com.example.simpleWebApp1.controller;

import com.example.simpleWebApp1.model.Product;
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

    @GetMapping("/product")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/product/{productId}")
    public Product getProductsById(@PathVariable int productId){
        return service.getProductById(productId);
    }

    @PostMapping("/product")
    public void addProduct(@RequestBody Product product){
        service.addProduct(product);
    }

    @PutMapping("/product")
    public String  updateProduct(@RequestBody Product product){
        service.updateProduct(product);
        return "Updated the product.";
    }

    @DeleteMapping("/product/{productId}")
    public String deleteProduct(@PathVariable int productId){
        service.deleteProduct(productId);
        return  "Deleted one product.";
    }

}
