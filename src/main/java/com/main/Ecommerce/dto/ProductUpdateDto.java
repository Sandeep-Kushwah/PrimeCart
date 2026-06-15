package com.main.Ecommerce.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductUpdateDto {
    @NotBlank(message = "Name can not be blank")
    private String name;
    
    @NotBlank(message = "Description can bot be blank")
    private String description;

    @NotBlank(message = "Brand is null")
    private String brand;

    @Positive
    @Min(value = 1, message = "Price must be greater than 0")
    @NotNull
    private long price;

    @Positive
    @Min(value = 1, message = "Discount price must be greater than 0")
    private long discountPrice;

    private String imageUrl;
}
