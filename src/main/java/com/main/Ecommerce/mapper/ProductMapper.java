package com.main.Ecommerce.mapper;

import java.util.ArrayList;
import java.util.List;

import com.main.Ecommerce.dto.ProductDto;
import com.main.Ecommerce.dto.ProductRequestDto;
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
                .brand(product.getProductBrand())
                .price(product.getProductPrice())
                .discountPrice(product.getProductDiscountPrice())
                .imageUrl(product.getProductImageUrl())
                .status(product.getProductStatus())
                .localDateTime(product.getLocalDateTime())
                .build();
    }

    /**
     * To convert ProductDto object into Product object. 
     */ 
    public static Product toProduct(ProductDto product){
        return Product.builder()
                .productId(product.getId())
                .productName(product.getName())
                .productDescription(product.getDescription())
                .productBrand(product.getBrand())
                .productPrice(product.getPrice())
                .productDiscountPrice(product.getDiscountPrice())
                .productImageUrl(product.getImageUrl())
                .productStatus(product.getStatus())
                .localDateTime(product.getLocalDateTime())
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
                .brand(product.getProductBrand())
                .price(product.getProductPrice())
                .discountPrice(product.getProductDiscountPrice())
                .imageUrl(product.getProductImageUrl())
                .status(product.getProductStatus())
                .localDateTime(product.getLocalDateTime())
                .build()
            );
        }
        return list;
    }

    /**
     * To convert ProductRequest into Product Object
     */ 
    public static Product toDto(ProductRequestDto productRequest){
        return Product.builder()
                .productName(productRequest.getName())
                .productDescription(productRequest.getDescription())
                .productBrand(productRequest.getBrand())
                .productPrice(productRequest.getPrice())
                .productDiscountPrice(productRequest.getDiscountPrice())
                .productImageUrl(productRequest.getImageUrl())
                .build();
    }

    /**
     * To convert Product into ProductRequest Object
     */ 
    public static ProductRequestDto  toProductRequest(Product product){
        return ProductRequestDto.builder()
                .name(product.getProductName())
                .description(product.getProductDescription())
                .brand(product.getProductBrand())
                .price(product.getProductPrice())
                .discountPrice(product.getProductDiscountPrice())
                .imageUrl(product.getProductImageUrl())
                .build();
    }
}
