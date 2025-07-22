package com.aromapedia.product_service.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class ProductCreateUpdateDto {
    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Brand is required")
    private String brand;

    @NotBlank(message = "Description is required")
    @Min(value = 10, message = "Description must be at least 10 characters long")
    private String description;

    @NotBlank(message = "Perfumer is required")
    private String perfumer;
}
