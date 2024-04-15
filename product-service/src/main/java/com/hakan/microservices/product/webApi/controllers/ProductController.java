package com.hakan.microservices.product.webApi.controllers;


import com.hakan.microservices.product.business.abstracts.ProductService;
import com.hakan.microservices.product.business.requests.ProductRequest;
import com.hakan.microservices.product.business.responses.ProductResponse;
import com.hakan.microservices.product.entities.concretes.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
  private final ProductService productService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponse createProduct(@RequestBody ProductRequest productRequest){
  return this.productService.createProduct(productRequest);
    }

    @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public List<ProductResponse> getAllProducts(){return productService.getAllProducts();}

}
