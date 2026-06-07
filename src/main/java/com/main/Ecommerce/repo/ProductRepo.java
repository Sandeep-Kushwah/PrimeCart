package com.main.Ecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.Ecommerce.entities.Product;


@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

    /* 
     Here we will define methods according to our requirements
    */
}
