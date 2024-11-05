package com.pedrom.sprintboot.di.app.sprintbootdi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedrom.sprintboot.di.app.sprintbootdi.models.Product;
import com.pedrom.sprintboot.di.app.sprintbootdi.services.ProductServiceImpl;


@RestController
@RequestMapping("/api")
public class SomeController {

    private ProductServiceImpl service = new ProductServiceImpl();
    @GetMapping
    public List<Product> list(){
        return service.findAll();

    }


    @GetMapping("/{id}")
    public Product show(@PathVariable Long id) {
        return service.findById(id);

    }
    

}
