package com.pedrom.sprintboot.di.app.sprintbootdi.repositories;

import java.util.Arrays;
import java.util.List;

import com.pedrom.sprintboot.di.app.sprintbootdi.models.Product;

public class ProductRepository {

    private  List<Product> data;

    public ProductRepository(){
        this.data = Arrays.asList(
            new Product(1L, "Memoria", 2000L),
            new Product(2L, "CPU", 400L),
            new Product(3L, "Teclado", 100L),
            new Product(4L, "Mouse", 50L)    
        );
    }


    public List<Product>finadAll(){
        
        
        return data;
    }


    public Product findById(Long id){


        /*Ambas maneras son validas */
        //return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElseThrow();
        return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

}
