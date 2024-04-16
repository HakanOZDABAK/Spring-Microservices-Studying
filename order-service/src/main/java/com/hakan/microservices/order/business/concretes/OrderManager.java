package com.hakan.microservices.order.business.concretes;

import com.hakan.microservices.order.business.abstracts.OrderService;
import com.hakan.microservices.order.business.requests.OrderRequest;
import com.hakan.microservices.order.dataAccess.abstracts.OrderRepository;
import com.hakan.microservices.order.entities.concretes.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderManager implements OrderService{

    private final OrderRepository orderRepository;
    @Override
    public void placeOrder(OrderRequest orderRequest) {
      Order order =  new Order();
      order.setOrderNumber(UUID.randomUUID().toString());
      order.setPrice(orderRequest.price());
      order.setQuantity(orderRequest.quantity());
      order.setSkuCode(orderRequest.skucCode());
      this.orderRepository.save(order);
    }
}
