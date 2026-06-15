package com.main.Ecommerce.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.main.Ecommerce.dto.ProductDto;
import com.main.Ecommerce.dto.ProductRequestDto;

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
    public ProductRequestDto addProduct(ProductRequestDto product);
    
    /** 
     * To update an existing product
     */
    public ProductDto updateProduct(ProductDto product);

    /**
     * To update image of a product with the help of product ID
     */
    public ProductDto updateProductImage(long id, MultipartFile file);
    
    /** 
     * To delete an product
     */
    public String deleteProduct(long productId);
}