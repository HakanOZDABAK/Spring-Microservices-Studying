package com.hakan.microservices.inventory.business.concretes;

import com.hakan.microservices.inventory.business.abstracts.InventoryService;
import com.hakan.microservices.inventory.dataAccess.abstracts.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InventoryManager implements InventoryService {

    private final InventoryRepository inventoryRepository;

    @Override
    public boolean isInStock(String skuCode, Integer quantity) {

        return this.inventoryRepository.existsBySkuCodeAndQuantityIsGreaterThanEqual(skuCode,quantity);
    }
}
