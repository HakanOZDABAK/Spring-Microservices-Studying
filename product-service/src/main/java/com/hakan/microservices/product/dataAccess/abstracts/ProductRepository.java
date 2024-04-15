package com.hakan.microservices.product.dataAccess.abstracts;

import com.hakan.microservices.product.entities.concretes.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {

}
