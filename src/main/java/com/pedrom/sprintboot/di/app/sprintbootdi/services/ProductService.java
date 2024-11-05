package com.pedrom.sprintboot.di.app.sprintbootdi.services;

import java.util.List;

import com.pedrom.sprintboot.di.app.sprintbootdi.models.Product;

public interface ProductService {

    List<Product> findAll();


    Product findById(Long id);
}
