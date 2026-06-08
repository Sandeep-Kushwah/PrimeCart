package com.main.Ecommerce.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.main.Ecommerce.dto.ProductDto;
import com.main.Ecommerce.dto.ProductRequest;
import com.main.Ecommerce.service.impl.ProductServiceImpl;

import jakarta.validation.Valid;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // Or use "*" to allow access from any port
public class ProductController {

    @Autowired
    ProductServiceImpl productService;

    /** 
     * To get product details through product ID
     */
    @GetMapping("/product/{productId}")
    public ResponseEntity<ProductDto> geProductById(@PathVariable long productId) {
        /** 
         * We can also use HttpStatus.OK
         * return ResponseEntity.status(HttpStatus.OK).body(productService.getProductById(productId));
         */
        return ResponseEntity.ok(productService.getProductById(productId));
    }

    /**
     * To get details of all the products
     */
    @GetMapping("/product")
    public ResponseEntity<List<ProductDto>> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }

    /**  
     *  To add new product
     */
    @PostMapping("/product")
    public ResponseEntity<ProductRequest> addProduct(@RequestBody @Valid ProductRequest product) {
        return ResponseEntity.ok(productService.addProduct(product));
    }

    /**
     * To update an existing product
     */
    @PutMapping("/product")
    public ResponseEntity<ProductDto> updateProduct(@RequestBody ProductDto product) {        
        return ResponseEntity.ok(productService.updateProduct(product));
    }
    
    /**
     * To delete an product  
     */ 
    @DeleteMapping("/product/{productId}")
    public ResponseEntity<String> deleteProduct(@PathVariable long productId){
        String status = productService.deleteProduct(productId);
        return ResponseEntity.ok(status);
    }
}
