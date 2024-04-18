package com.hakan.microservices.order.stubs;

import static  com.github.tomakehurst.wiremock.client.WireMock.*
public class InventoryClientStub {

    public void stubInventoryCall(String skuCode,Integer quantity){

        stubFor(get(urlEqualTo("/api/inventory?SkucCode=" + skuCode + "&quantity=" + quantity))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json")
                        .withBody("true")));
    }
}
