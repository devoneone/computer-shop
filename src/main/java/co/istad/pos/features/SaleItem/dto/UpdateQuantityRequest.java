package co.istad.pos.features.SaleItem.dto;

import lombok.Builder;

@Builder
public record UpdateQuantityRequest(
        int qty
) {
}
