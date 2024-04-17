package com.hakan.microservices.inventory.business.abstracts;

public interface InventoryService {

    boolean isInStock(String skuCode,Integer quantity);
}
