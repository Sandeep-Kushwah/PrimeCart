package com.main.Ecommerce.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.main.Ecommerce.dto.ProductDto;
import com.main.Ecommerce.dto.ProductRequestDto;
import com.main.Ecommerce.service.CloudinaryService;
import com.main.Ecommerce.service.impl.ProductServiceImpl;

import jakarta.validation.Valid;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // Or use "*" to allow access from any port
public class ProductController {

    final ProductServiceImpl productService;
    final CloudinaryService cloudinaryService;

    /**
     * 
     * In this file we have five end-points/Methods to manage product details.
     * 1. GetMapping("product/{productId}") To get Product by product ID.
     * 2. GetMapping("product") To get all products.
     * 3. PostMapping("product") To add new product.
     * 4. PutMapping("product") To edit an existing product.
     * 5. DeleteMapping(product/{productId}) To delete a product by product ID.
     * 
     * @param productService    It handles product database operations.
     * @param cloudinaryService It handles image uploading task on cloudinary and
     *                          provides image url.
     */

    ProductController(ProductServiceImpl productService, CloudinaryService cloudinaryService) {
        this.productService = productService;
        this.cloudinaryService = cloudinaryService;
    }

    /**
     * To get product details through product ID
     */
    @GetMapping("/product/{productId}")
    public ResponseEntity<ProductDto> geProductById(@PathVariable long productId) {
        /**
         * We can also use HttpStatus.OK
         * return
         * ResponseEntity.status(HttpStatus.OK).body(productService.getProductById(productId));
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
     * To add new product
     */
    @PostMapping("/product")
    public ResponseEntity<?> addProduct(@RequestPart @Valid ProductRequestDto product,
            @RequestPart("image") MultipartFile file) {

        /**
         * To check is file null/Empty or not
         */
        if (file == null || file.isEmpty())
            return ResponseEntity.badRequest().body(Map.of("error", "No file chosen !!!"));

        /**
         * Upload image on cloud and get image url and save in database
         */
        product.setImageUrl(cloudinaryService.upload(file));

        return ResponseEntity.ok(productService.addProduct(product));
    }

    /**
     * To update an existing product
     */
    @PutMapping("/product")
    public ResponseEntity<ProductDto> updateProductDetails(@RequestPart ProductDto product) {
        return ResponseEntity.ok(productService.updateProduct(product));
    }

    //To update product image
    @PutMapping("/product/{productId}")
    public String updateProductImage(@PathVariable long productId, @RequestPart("image") MultipartFile file) {
    
        ProductDto pd = productService.updateProductImage(productId, file);
        return pd.getImageUrl();
    }

    /**
     * To delete an product
     */
    @DeleteMapping("/product/{productId}")
    public ResponseEntity<String> deleteProduct(@PathVariable long productId) {
        return ResponseEntity.ok(productService.deleteProduct(productId));
    }
}
