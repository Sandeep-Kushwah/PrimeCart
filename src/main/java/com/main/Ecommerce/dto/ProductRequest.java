package com.main.Ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class ProductRequest {
    private String name;
    private String description;
    private long price;
    private String imageUrl;
}
