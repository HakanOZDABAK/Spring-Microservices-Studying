package com.hakan.microservices.product.business.concretes;

import com.hakan.microservices.product.business.abstracts.ProductService;
import com.hakan.microservices.product.business.requests.ProductRequest;
import com.hakan.microservices.product.business.responses.ProductResponse;
import com.hakan.microservices.product.dataAccess.abstracts.ProductRepository;
import com.hakan.microservices.product.entities.concretes.Product;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
@Slf4j
public class ProductManager implements ProductService {

    private  final ProductRepository productRepository;
    @Override
    public ProductResponse createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.name())
                .description(productRequest.description())
                .price(productRequest.price())
                .build();
        this.productRepository.save(product);
        log.info("Product created successfully");
        return new ProductResponse(product.getId(),product.getName(),product.getDescription(),product.getPrice());
    }

    @Override
    public List<ProductResponse> getAllProducts() {
        return this.productRepository.findAll()
                .stream().map(product -> new ProductResponse(product.getId(),product.getName(),product.getDescription(),product.getPrice());
    }
}
