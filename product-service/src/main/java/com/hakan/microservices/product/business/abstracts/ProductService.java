package com.hakan.microservices.product.business.abstracts;

import com.hakan.microservices.product.business.requests.ProductRequest;

public interface ProductService {

    void createProduct(ProductRequest productRequest);
}
