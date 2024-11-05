package com.pedrom.sprintboot.di.app.sprintbootdi.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.pedrom.sprintboot.di.app.sprintbootdi.models.Product;
import com.pedrom.sprintboot.di.app.sprintbootdi.repositories.ProductRepositoryImpl;

public class ProductServiceImpl implements ProductService {
  

    //private ProductRepositoryImpl repository = new ProductRepositoryImpl();
    @Autowired 
    private ProductRepositoryImpl repository ;


    @Override   
   public List<Product> findAll(){
    return repository.findAll().stream().map(p ->{
        Double priceTax = p.getPrice() * 1.25d;
       
        Product newProd = (Product) p.clone() ;

        newProd.setPrice(priceTax.longValue());
        return newProd;
        //  Product newProd = new Product(p.getId(), p.getName(), priceTax.longValue());
        // return newProd;
        
        //p.setPrice(priceTax.longValue());
        //return p;
    }).collect(Collectors.toList());
   } 

   public Product findById(Long id){
        return repository.findById(id);
   }

}
