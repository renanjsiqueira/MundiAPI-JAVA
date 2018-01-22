/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import org.joda.time.DateTime;

public class GetCheckoutBoletoPaymentResponseBuilder {
    //the instance to build
    private GetCheckoutBoletoPaymentResponse getCheckoutBoletoPaymentResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetCheckoutBoletoPaymentResponseBuilder() {
        getCheckoutBoletoPaymentResponse = new GetCheckoutBoletoPaymentResponse();
    }

    /**
     * Data de vencimento do boleto
     */
    public GetCheckoutBoletoPaymentResponseBuilder dueAt(DateTime dueAt) {
        getCheckoutBoletoPaymentResponse.setDueAt(dueAt);
        return this;
    }

    /**
     * Instruções do boleto
     */
    public GetCheckoutBoletoPaymentResponseBuilder instructions(String instructions) {
        getCheckoutBoletoPaymentResponse.setInstructions(instructions);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetCheckoutBoletoPaymentResponse build() {
        return getCheckoutBoletoPaymentResponse;
    }
}