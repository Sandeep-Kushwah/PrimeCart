package com.main.Ecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.main.Ecommerce.entities.Product;


public interface ProductRepo extends JpaRepository<Product, Long> {

    /* 
     Here we will define methods according to our requirements
    */
}
