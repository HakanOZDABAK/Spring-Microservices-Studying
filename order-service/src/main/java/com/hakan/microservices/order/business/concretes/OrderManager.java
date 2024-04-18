package com.hakan.microservices.order.business.concretes;

import com.hakan.microservices.order.business.abstracts.OrderService;
import com.hakan.microservices.order.business.requests.OrderRequest;
import com.hakan.microservices.order.client.InventoryClient;
import com.hakan.microservices.order.dataAccess.abstracts.OrderRepository;
import com.hakan.microservices.order.entities.concretes.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderManager implements OrderService{

    private final OrderRepository orderRepository;
    private final InventoryClient inventoryClient;
    @Override
    public void placeOrder(OrderRequest orderRequest) {
      var isProductInStock =   this.inventoryClient.isInStock(orderRequest.skuCode(),orderRequest.quantity());

      if(isProductInStock){
          Order order =  new Order();
          order.setOrderNumber(UUID.randomUUID().toString());
          order.setPrice(orderRequest.price());
          order.setQuantity(orderRequest.quantity());
          order.setSkuCode(orderRequest.skuCode());
          this.orderRepository.save(order);
      }
      else {

          throw new RuntimeException("Product with SkuCode" + orderRequest.skuCode()+ " is not in  stock");
      }

    }
}
