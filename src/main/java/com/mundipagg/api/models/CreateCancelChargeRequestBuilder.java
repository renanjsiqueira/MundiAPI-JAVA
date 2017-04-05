/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class CreateCancelChargeRequestBuilder {
    //the instance to build
    private CreateCancelChargeRequest createCancelChargeRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CreateCancelChargeRequestBuilder() {
        createCancelChargeRequest = new CreateCancelChargeRequest();
    }

    /**
     * The amount that will be canceled.
     */
    public CreateCancelChargeRequestBuilder amount(Integer amount) {
        createCancelChargeRequest.setAmount(amount);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateCancelChargeRequest build() {
        return createCancelChargeRequest;
    }
}