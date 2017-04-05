/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class CreateCustomerRequestBuilder {
    //the instance to build
    private CreateCustomerRequest createCustomerRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CreateCustomerRequestBuilder() {
        createCustomerRequest = new CreateCustomerRequest();
    }

    /**
     * Name
     */
    public CreateCustomerRequestBuilder name(String name) {
        createCustomerRequest.setName(name);
        return this;
    }

    /**
     * Email
     */
    public CreateCustomerRequestBuilder email(String email) {
        createCustomerRequest.setEmail(email);
        return this;
    }

    /**
     * Phone number. Only numbers, no special characters.
     */
    public CreateCustomerRequestBuilder phone(String phone) {
        createCustomerRequest.setPhone(phone);
        return this;
    }

    /**
     * Document number. Only numbers, no special characters.
     */
    public CreateCustomerRequestBuilder document(String document) {
        createCustomerRequest.setDocument(document);
        return this;
    }

    /**
     * Person type. Can be either 'person' or 'company'
     */
    public CreateCustomerRequestBuilder personType(String personType) {
        createCustomerRequest.setPersonType(personType);
        return this;
    }

    /**
     * The customer's address
     */
    public CreateCustomerRequestBuilder address(CreateAddressRequest address) {
        createCustomerRequest.setAddress(address);
        return this;
    }

    /**
     * Metadata
     */
    public CreateCustomerRequestBuilder metadata(LinkedHashMap<String, String> metadata) {
        createCustomerRequest.setMetadata(metadata);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateCustomerRequest build() {
        return createCustomerRequest;
    }
}