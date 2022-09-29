package com.usa.misiontic.masterclass3.repository;

import com.usa.misiontic.masterclass3.entities.Product;
import com.usa.misiontic.masterclass3.repository.crudRepository.ProductCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository {

    //Se inicializa con el autowired
    @Autowired
    private ProductCrudRepository productCrudRepository;

    public List<Product> getAll(){
        return (List<Product>)productCrudRepository.findAll();
    }

    public Optional<Product> getProduct(int id){
        return productCrudRepository.findById(id);
    }

    //Si el objeto no existe, lo guarda y si existe lo actualiza
    public Product save(Product p){
        return productCrudRepository.save(p);
    }

    public void delete(Product p){
        productCrudRepository.delete(p);
    }

}
