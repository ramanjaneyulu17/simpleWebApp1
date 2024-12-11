package com.example.simpleWebApp1.service;

import com.example.simpleWebApp1.model.Products;
import com.example.simpleWebApp1.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    public List<Products> getProducts() {
        return  repo.findAll();
    }

    public Products getProductById(int productId) {
        return repo.findById(productId).orElse(new Products());
    }

    public void addProduct(Products product){
        repo.save(product);
    }

    public void updateProduct(Products product) {
        repo.save(product);
    }

    public void deleteProduct(int productId) {
        repo.deleteById(productId);
    }
}
