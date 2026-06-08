package com.main.Ecommerce.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class ProductRequest {

    @NotBlank(message = "Name can not be blank")
    private String name;
    
    @NotBlank(message = "Description can bot be blank")
    private String description;

    @Positive
    @Min(value = 1, message = "Price must be greater than 0")
    private long price;

    private String imageUrl;
}
