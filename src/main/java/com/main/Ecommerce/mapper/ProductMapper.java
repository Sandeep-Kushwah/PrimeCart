package com.main.Ecommerce.mapper;

import java.util.ArrayList;
import java.util.List;

import com.main.Ecommerce.dto.ProductDto;
import com.main.Ecommerce.dto.ProductRequest;
import com.main.Ecommerce.entities.Product;

public class ProductMapper {

    /**
     * To convert Product object into ProductDto object.
     */
    public static ProductDto toDto(Product product){
        return ProductDto.builder()
                .id(product.getProductId())
                .name(product.getProductName())
                .description(product.getProductDescription())
                .price(product.getProductPrice())
                .imageUrl(product.getProductImageUrl())
                .build();
    }

    /**
     * To convert Product object into ProductDto object. 
     */ 
    public static Product toProduct(ProductDto product){
        return Product.builder()
                .productId(product.getId())
                .productName(product.getName())
                .productDescription(product.getDescription())
                .productPrice(product.getPrice())
                .productImageUrl(product.getImageUrl())
                .build();
    }

    /** 
     * To convert list of Product into ProductDto list.
     */ 
    public static List<ProductDto> toDto(List<Product> productList){

        List<ProductDto> list = new ArrayList<>();

        for(Product product : productList)
        {
            list.add(
                ProductDto.builder()
                .id(product.getProductId())
                .name(product.getProductName())
                .description(product.getProductDescription())
                .price(product.getProductPrice())
                .imageUrl(product.getProductImageUrl())
                .build()
            );
        }
        return list;
    }

    /**
     * To convert ProductRequest into Product Object
     */ 
    public static Product toDto(ProductRequest productRequest){
        return Product.builder()
                .productName(productRequest.getName())
                .productDescription(productRequest.getDescription())
                .productPrice(productRequest.getPrice())
                .productImageUrl(productRequest.getImageUrl())
                .build();
    }

    /**
     * To convert Product into ProductRequest Object
     */ 
    public static ProductRequest  toProductRequest(Product product){
        return ProductRequest.builder()
                .name(product.getProductName())
                .description(product.getProductDescription())
                .price(product.getProductPrice())
                .imageUrl(product.getProductImageUrl())
                .build();
    }
}
