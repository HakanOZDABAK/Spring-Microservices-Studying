package com.hakan.microservices.product.business.abstracts;

import com.hakan.microservices.product.business.requests.ProductRequest;
import com.hakan.microservices.product.business.responses.ProductResponse;
import com.hakan.microservices.product.entities.concretes.Product;

import java.util.List;

public interface ProductService {

    ProductResponse createProduct(ProductRequest productRequest);

    List<ProductResponse> getAllProducts();
}
