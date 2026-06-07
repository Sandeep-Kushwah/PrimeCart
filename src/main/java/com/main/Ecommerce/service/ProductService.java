package com.main.Ecommerce.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.main.Ecommerce.dto.ProductDto;
import com.main.Ecommerce.dto.ProductRequest;

@Service
public interface ProductService {

    /**
     * To get a Product by product id
     */
    public ProductDto getProductById(long productId);
    
    /**
     * To get all the products 
     */
    public List<ProductDto> getAllProducts();
    
    /**
     * To add a new Product
     */
    public ProductRequest addProduct(ProductRequest product);
    
    /** 
     * To update an existing product
     */
    public ProductDto updateProduct(ProductDto product);
    
    /** 
     * To delete an product
     */
    public String deleteProduct(long productId);
}