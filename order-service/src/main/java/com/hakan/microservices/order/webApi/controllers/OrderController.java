package com.hakan.microservices.order.webApi.controllers;

import com.hakan.microservices.order.business.abstracts.OrderService;
import com.hakan.microservices.order.business.requests.OrderRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest){
        this.orderService.placeOrder(orderRequest);
        return "Order Placed Successfully";
    }

}
