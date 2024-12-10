package com.example.simpleWebApp1.repository;

import com.example.simpleWebApp1.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Products, Integer> {

}
