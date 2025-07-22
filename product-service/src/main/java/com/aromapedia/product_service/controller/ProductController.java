package com.aromapedia.product_service.controller;

import com.aromapedia.product_service.dto.ProductCreateUpdateDto;
import com.aromapedia.product_service.dto.ProductCreateUpdateRequest;
import com.aromapedia.product_service.dto.ProductDto;
import com.aromapedia.product_service.entity.Product;
import com.aromapedia.product_service.mapper.ProductMapper;
import com.aromapedia.product_service.service.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;
    private final ProductMapper productMapper;

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @PostMapping
    public ResponseEntity<ProductDto> createProduct(@Valid @RequestBody ProductCreateUpdateDto dto) {
        ProductCreateUpdateRequest request = productMapper.toProductCreateUpdateRequest(dto);

        Product product = productService.createProduct(request);
        ProductDto productDto = productMapper.toProductDto(product);
        return ResponseEntity.ok(productDto);
    }


}
