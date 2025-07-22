package com.aromapedia.product_service.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductCreateUpdateRequest {
    private String name;

    private String brand;

    private String description;

    private String perfumer;

}
