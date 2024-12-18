package com.example.simpleWebApp1.controller;

import com.example.simpleWebApp1.model.Productz;
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
    public List<Productz> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/product/{productId}")
    public Productz getProductsById(@PathVariable int productId){
        return service.getProductById(productId);
    }

    @PostMapping("/product")
    public void addProduct(@RequestBody Productz productz){
        service.addProduct(productz);
    }

    @PutMapping("/product")
    public String  updateProduct(@RequestBody Productz productz){
        service.updateProduct(productz);
        return "Updated the product.";
    }

    @DeleteMapping("/product/{productId}")
    public String deleteProduct(@PathVariable int productId){
        service.deleteProduct(productId);
        return  "Deleted one product.";
    }

}
