/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class GetOrderItemResponseBuilder {
    //the instance to build
    private GetOrderItemResponse getOrderItemResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetOrderItemResponseBuilder() {
        getOrderItemResponse = new GetOrderItemResponse();
    }

    public GetOrderItemResponseBuilder amount(int amount) {
        getOrderItemResponse.setAmount(amount);
        return this;
    }

    public GetOrderItemResponseBuilder description(String description) {
        getOrderItemResponse.setDescription(description);
        return this;
    }

    public GetOrderItemResponseBuilder quantity(int quantity) {
        getOrderItemResponse.setQuantity(quantity);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetOrderItemResponse build() {
        return getOrderItemResponse;
    }
}