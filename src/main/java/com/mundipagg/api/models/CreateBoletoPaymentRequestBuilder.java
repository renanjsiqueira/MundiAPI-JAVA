/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class CreateBoletoPaymentRequestBuilder {
    //the instance to build
    private CreateBoletoPaymentRequest createBoletoPaymentRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CreateBoletoPaymentRequestBuilder() {
        createBoletoPaymentRequest = new CreateBoletoPaymentRequest();
    }

    /**
     * Number of retries
     */
    public CreateBoletoPaymentRequestBuilder retries(int retries) {
        createBoletoPaymentRequest.setRetries(retries);
        return this;
    }

    /**
     * The bank code, containing three characters. The available codes are on the API specification
     */
    public CreateBoletoPaymentRequestBuilder bank(String bank) {
        createBoletoPaymentRequest.setBank(bank);
        return this;
    }

    /**
     * The instructions field that will be printed on the boleto.
     */
    public CreateBoletoPaymentRequestBuilder instructions(String instructions) {
        createBoletoPaymentRequest.setInstructions(instructions);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateBoletoPaymentRequest build() {
        return createBoletoPaymentRequest;
    }
}