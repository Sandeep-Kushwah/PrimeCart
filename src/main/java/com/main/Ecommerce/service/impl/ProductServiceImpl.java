package com.main.Ecommerce.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.main.Ecommerce.dto.ProductDto;
import com.main.Ecommerce.dto.ProductRequest;
import com.main.Ecommerce.entities.Product;
import com.main.Ecommerce.mapper.ProductMapper;
import com.main.Ecommerce.repo.ProductRepo;
import com.main.Ecommerce.service.ProductService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;

    /**
     * To get single product through product ID
     */
    public ProductDto getProductById(long productId) {
        try {
            Optional<Product> product = productRepo.findById(productId);
            return ProductMapper.toDto(product.get());
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * To get all the products
     */
    public List<ProductDto> getAllProducts() {
        try {
            return ProductMapper.toDto(productRepo.findAll());
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * To add new product
     */
    public ProductRequest addProduct(ProductRequest product) {
        try {
            Product returnProduct = productRepo.save(ProductMapper.toDto(product));
            return ProductMapper.toProductRequest(returnProduct);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * To update an existing product
     */
    public ProductDto updateProduct(ProductDto product) {
        try {
            ProductDto updatingProduct = getProductById(product.getId());
            updatingProduct.setName(product.getName());
            updatingProduct.setDescription(product.getDescription());
            updatingProduct.setPrice(product.getPrice());
            updatingProduct.setImageUrl(product.getImageUrl());

            Product product2 = productRepo.save(ProductMapper.toProduct(updatingProduct));
            return ProductMapper.toDto(product2);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * To delete an product by product Id
     */
    public String deleteProduct(long productId) {
        try {
            if (!productRepo.existsById(productId)) {
                return "Failed : May ID does not exist";
            } else {
                productRepo.deleteById(productId);
                return "deleted";
            }
        } catch (Exception e) {
            return "Failed : Something went worng. Try after sometime";
        }
    }

}
