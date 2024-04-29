package com.hakan.microservices.order.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {
    @Bean
    public OpenAPI productServiceAPI(){

        return new OpenAPI().info(new Info().title("Order Service API")
                .description("For Order Service")
                .version("v1")
                .license(new License().name("Apache 2.0")))
                .externalDocs(new ExternalDocumentation().description("You can refer to the Order Service Wiki Doc")
                        .url("https://Order-service-dummy-url.com/docs"));
    }
}
