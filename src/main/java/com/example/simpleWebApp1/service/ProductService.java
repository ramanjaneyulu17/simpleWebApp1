package com.example.simpleWebApp1.service;

import com.example.simpleWebApp1.model.Productz;
import com.example.simpleWebApp1.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    public List<Productz> getProducts() {
        return  repo.findAll();
    }

    public Productz getProductById(int productId) {
        return repo.findById(productId).orElse(new Productz());
    }

    public void addProduct(Productz productz){
        repo.save(productz);
    }

    public void updateProduct(Productz productz) {
        repo.save(productz);
    }

    public void deleteProduct(int productId) {
        repo.deleteById(productId);
    }
}
