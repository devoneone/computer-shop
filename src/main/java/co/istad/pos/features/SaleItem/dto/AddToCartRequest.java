package co.istad.pos.features.SaleItem.dto;

import lombok.Builder;

@Builder
public record AddToCartRequest(
        String productName,
        int qty
) {
}
