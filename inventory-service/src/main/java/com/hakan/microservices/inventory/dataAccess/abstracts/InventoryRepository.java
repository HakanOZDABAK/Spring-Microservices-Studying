package com.hakan.microservices.inventory.dataAccess.abstracts;

import com.hakan.microservices.inventory.entities.concretes.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory,Long> {
    boolean existsBySkuCodeAndQuantityIsGreaterThanEquals(String skuCode, Integer quantity);
}
