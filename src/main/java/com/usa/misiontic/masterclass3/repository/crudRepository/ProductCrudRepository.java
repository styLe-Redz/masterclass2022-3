package com.usa.misiontic.masterclass3.repository.crudRepository;

import com.usa.misiontic.masterclass3.entities.Product;
import org.springframework.data.repository.CrudRepository;

//Con la extension me comunico con la base de datos
public interface ProductCrudRepository extends CrudRepository<Product, Integer> {
}
