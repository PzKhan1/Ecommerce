package dev.Pz.productservicettsevening.dtos;

import dev.Pz.productservicettsevening.models.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetSingleProductResponseDto {
    private Product product;
}
