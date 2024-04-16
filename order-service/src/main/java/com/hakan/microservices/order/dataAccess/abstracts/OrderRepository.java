package com.hakan.microservices.order.dataAccess.abstracts;

import com.hakan.microservices.order.entities.concretes.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
