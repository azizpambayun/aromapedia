package com.aromapedia.product_service.service;

import com.aromapedia.product_service.dto.ProductCreateUpdateRequest;
import com.aromapedia.product_service.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();

    Product createProduct(ProductCreateUpdateRequest request);
}
