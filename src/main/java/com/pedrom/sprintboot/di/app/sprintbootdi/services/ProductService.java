package com.pedrom.sprintboot.di.app.sprintbootdi.services;

import java.util.List;
import java.util.stream.Collectors;

import com.pedrom.sprintboot.di.app.sprintbootdi.models.Product;
import com.pedrom.sprintboot.di.app.sprintbootdi.repositories.ProductRepository;

public class ProductService {
    /**
     * @return
     */
    private ProductRepository repository = new ProductRepository();

   public List<Product> findAll(){
    return repository.finadAll().stream().map(p ->{
        Double priceImp = p.getPrice() * 1.25d;
        p.setPrice(priceImp.longValue());
        return p;
    }).collect(Collectors.toList());
   } 

   public Product findById(Long id){
        return repository.findById(id);
   }
}
