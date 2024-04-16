package com.hakan.microservices.order.business.abstracts;

import com.hakan.microservices.order.business.requests.OrderRequest;

public interface OrderService {

    void placeOrder(OrderRequest orderRequest);
}
