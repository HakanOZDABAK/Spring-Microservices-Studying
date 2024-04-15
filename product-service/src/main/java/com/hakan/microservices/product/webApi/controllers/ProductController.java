package com.hakan.microservices.product.webApi.controllers;


import com.hakan.microservices.product.business.requests.ProductRequest;
import com.hakan.microservices.product.entities.concretes.Product;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest){

    }
}
