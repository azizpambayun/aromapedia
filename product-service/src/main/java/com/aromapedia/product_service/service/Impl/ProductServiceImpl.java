package com.aromapedia.product_service.service.Impl;

import com.aromapedia.product_service.dto.ProductCreateUpdateRequest;
import com.aromapedia.product_service.entity.Product;
import com.aromapedia.product_service.repository.ProductRepository;
import com.aromapedia.product_service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product createProduct(ProductCreateUpdateRequest request) {
        Product product = Product.builder()
                .name(request.getName())
                .brand(request.getBrand())
                .description(request.getDescription())
                .perfumer(request.getPerfumer())
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();

        return productRepository.save(product);
    }


}
