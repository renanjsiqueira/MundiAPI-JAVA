/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class CreateCreditCardRequestBuilder {
    //the instance to build
    private CreateCreditCardRequest createCreditCardRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CreateCreditCardRequestBuilder() {
        createCreditCardRequest = new CreateCreditCardRequest();
    }

    /**
     * Credit card number
     */
    public CreateCreditCardRequestBuilder number(String number) {
        createCreditCardRequest.setNumber(number);
        return this;
    }

    /**
     * Holder name, as written on the card
     */
    public CreateCreditCardRequestBuilder holderName(String holderName) {
        createCreditCardRequest.setHolderName(holderName);
        return this;
    }

    /**
     * The expiration month
     */
    public CreateCreditCardRequestBuilder expMonth(int expMonth) {
        createCreditCardRequest.setExpMonth(expMonth);
        return this;
    }

    /**
     * The expiration year, that can be informed with 2 or 4 digits
     */
    public CreateCreditCardRequestBuilder expYear(int expYear) {
        createCreditCardRequest.setExpYear(expYear);
        return this;
    }

    /**
     * The card's security code
     */
    public CreateCreditCardRequestBuilder cvv(String cvv) {
        createCreditCardRequest.setCvv(cvv);
        return this;
    }

    /**
     * Card's billing address
     */
    public CreateCreditCardRequestBuilder billingAddress(CreateAddressRequest billingAddress) {
        createCreditCardRequest.setBillingAddress(billingAddress);
        return this;
    }

    /**
     * Card brand
     */
    public CreateCreditCardRequestBuilder brand(String brand) {
        createCreditCardRequest.setBrand(brand);
        return this;
    }

    /**
     * The credit card token, generated by the checkout script
     */
    public CreateCreditCardRequestBuilder token(String token) {
        createCreditCardRequest.setToken(token);
        return this;
    }

    /**
     * The address id for the billing address
     */
    public CreateCreditCardRequestBuilder billingAddressId(String billingAddressId) {
        createCreditCardRequest.setBillingAddressId(billingAddressId);
        return this;
    }

    /**
     * Metadata
     */
    public CreateCreditCardRequestBuilder metadata(LinkedHashMap<String, String> metadata) {
        createCreditCardRequest.setMetadata(metadata);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateCreditCardRequest build() {
        return createCreditCardRequest;
    }
}