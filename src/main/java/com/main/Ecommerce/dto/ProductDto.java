package com.main.Ecommerce.dto;

import java.time.LocalDateTime;
import com.main.Ecommerce.enums.Status;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDto {
    private long id;
    private String name;
    private String description;
    private String brand;
    private long price;
    private long discountPrice;
    private String imageUrl;
    private Status status;
    private LocalDateTime localDateTime; 

    /**
     * This thing worked successfully but try to understand how does it worked
     */
    public Status getStatus(){
        return this.status;
    }

    public ProductDto(Status status){
        this.status = status;
    }
}
