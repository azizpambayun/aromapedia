package com.aromapedia.product_service.mapper;

import com.aromapedia.product_service.dto.ProductCreateUpdateDto;
import com.aromapedia.product_service.dto.ProductCreateUpdateRequest;
import com.aromapedia.product_service.dto.ProductDto;
import com.aromapedia.product_service.entity.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE)
public interface ProductMapper {

    ProductCreateUpdateRequest toProductCreateUpdateRequest(
            ProductCreateUpdateDto dto
    );

    ProductDto toProductDto(Product product);
}
