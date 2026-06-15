package com.main.Ecommerce.entities;

import java.time.LocalDateTime;
import org.hibernate.annotations.CreationTimestamp;

import com.main.Ecommerce.enums.Status;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "Products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    /**
     * Primary Key
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productId;

    @Column(name = "Name", nullable = false)
    private String productName;

    @Column(name = "Description", length = 1000)
    private String productDescription;

    @Column(name = "brand", length = 100)
    private String productBrand;

    @Column(name = "Price", nullable = false)
    private long productPrice;

    @Column(name = "discountPrice")
    private long productDiscountPrice;

    // @Column(name = "imgaeUrl", nullable = false) Right approch and we will use in feature
    @Column(name = "imageUrl") // only for testing purpose
    private String productImageUrl;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    @Builder.Default
    private Status productStatus = Status.ACTIVE;

    /**
     * Product Creation Time
     */
    @CreationTimestamp
    @Column(name = "createdAt", nullable = false)
    private LocalDateTime localDateTime;
}
