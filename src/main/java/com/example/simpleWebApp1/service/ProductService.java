package com.example.simpleWebApp1.service;

import com.example.simpleWebApp1.model.Products;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Products> products=new ArrayList<>(Arrays.asList(new Products(101,"Mobile",25000),
            new Products(102,"Laptop",54000),
            new Products(103,"Buds",2500)));

    public List<Products> getProducts() {
        return  products;
    }

    public Products getProductById(int productId) {
        return  products.stream().filter(p->p.getProductId()==productId).findFirst().get();
    }

    public void addProduct(Products product){
        products.add(product);
    }

    public void updateProduct(Products product) {
        int index=0;
        for(int i=0;i<products.size();i++){
            if(products.get(i).getProductId()==product.getProductId()){
                index=i;
            }
        }
        products.set(index,product);
    }

    public void deleteProduct(int productId) {
        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductId() == productId) {
                index = i;
            }
            products.remove(index);
        }
    }
}
