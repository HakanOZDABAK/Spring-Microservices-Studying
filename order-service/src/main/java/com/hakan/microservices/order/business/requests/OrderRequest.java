package com.hakan.microservices.order.business.requests;

import java.math.BigDecimal;

public record OrderRequest(Long id, String orderNumber,
                           String skuCode, BigDecimal price, Integer quantity) {
}
