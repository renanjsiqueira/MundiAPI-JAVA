/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class GetCreditCardResponseBuilder {
    //the instance to build
    private GetCreditCardResponse getCreditCardResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetCreditCardResponseBuilder() {
        getCreditCardResponse = new GetCreditCardResponse();
    }

    public GetCreditCardResponseBuilder id(String id) {
        getCreditCardResponse.setId(id);
        return this;
    }

    public GetCreditCardResponseBuilder lastFourDigits(String lastFourDigits) {
        getCreditCardResponse.setLastFourDigits(lastFourDigits);
        return this;
    }

    public GetCreditCardResponseBuilder brand(String brand) {
        getCreditCardResponse.setBrand(brand);
        return this;
    }

    public GetCreditCardResponseBuilder holderName(String holderName) {
        getCreditCardResponse.setHolderName(holderName);
        return this;
    }

    public GetCreditCardResponseBuilder expMonth(int expMonth) {
        getCreditCardResponse.setExpMonth(expMonth);
        return this;
    }

    public GetCreditCardResponseBuilder expYear(int expYear) {
        getCreditCardResponse.setExpYear(expYear);
        return this;
    }

    public GetCreditCardResponseBuilder status(String status) {
        getCreditCardResponse.setStatus(status);
        return this;
    }

    public GetCreditCardResponseBuilder createdAt(Date createdAt) {
        getCreditCardResponse.setCreatedAt(createdAt);
        return this;
    }

    public GetCreditCardResponseBuilder updatedAt(Date updatedAt) {
        getCreditCardResponse.setUpdatedAt(updatedAt);
        return this;
    }

    public GetCreditCardResponseBuilder billingAddress(GetBillingAddressResponse billingAddress) {
        getCreditCardResponse.setBillingAddress(billingAddress);
        return this;
    }

    public GetCreditCardResponseBuilder customer(GetCustomerResponse customer) {
        getCreditCardResponse.setCustomer(customer);
        return this;
    }

    public GetCreditCardResponseBuilder metadata(LinkedHashMap<String, String> metadata) {
        getCreditCardResponse.setMetadata(metadata);
        return this;
    }

    public GetCreditCardResponseBuilder deletedAt(Date deletedAt) {
        getCreditCardResponse.setDeletedAt(deletedAt);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetCreditCardResponse build() {
        return getCreditCardResponse;
    }
}