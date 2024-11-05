package com.pedrom.sprintboot.di.app.sprintbootdi.repositories;

import java.util.List;

import com.pedrom.sprintboot.di.app.sprintbootdi.models.Product;

public interface ProductRepository {

    List<Product> findAll();

    Product findById(Long id);

}
