/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetCheckoutPaymentSettingsResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4854243268185304721L;
    private String successUrl;
    private String paymentUrl;
    private List<String> acceptedPaymentMethods;
    private String status;
    private GetCustomerResponse customer;
    private Integer amount;
    private String defaultPaymentMethod;
    private String gatewayAffiliationId;
    /** GETTER
     * Success Url
     */
    @JsonGetter("success_url")
    public String getSuccessUrl ( ) { 
        return this.successUrl;
    }
    
    /** SETTER
     * Success Url
     */
    @JsonSetter("success_url")
    public void setSuccessUrl (String value) { 
        this.successUrl = value;
    }
 
    /** GETTER
     * Payment Url
     */
    @JsonGetter("payment_url")
    public String getPaymentUrl ( ) { 
        return this.paymentUrl;
    }
    
    /** SETTER
     * Payment Url
     */
    @JsonSetter("payment_url")
    public void setPaymentUrl (String value) { 
        this.paymentUrl = value;
    }
 
    /** GETTER
     * Accepted Payment Methods
     */
    @JsonGetter("accepted_payment_methods")
    public List<String> getAcceptedPaymentMethods ( ) { 
        return this.acceptedPaymentMethods;
    }
    
    /** SETTER
     * Accepted Payment Methods
     */
    @JsonSetter("accepted_payment_methods")
    public void setAcceptedPaymentMethods (List<String> value) { 
        this.acceptedPaymentMethods = value;
    }
 
    /** GETTER
     * Status
     */
    @JsonGetter("status")
    public String getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * Status
     */
    @JsonSetter("status")
    public void setStatus (String value) { 
        this.status = value;
    }
 
    /** GETTER
     * Customer
     */
    @JsonGetter("customer")
    public GetCustomerResponse getCustomer ( ) { 
        return this.customer;
    }
    
    /** SETTER
     * Customer
     */
    @JsonSetter("customer")
    public void setCustomer (GetCustomerResponse value) { 
        this.customer = value;
    }
 
    /** GETTER
     * Payment amount
     */
    @JsonGetter("amount")
    public Integer getAmount ( ) { 
        return this.amount;
    }
    
    /** SETTER
     * Payment amount
     */
    @JsonSetter("amount")
    public void setAmount (Integer value) { 
        this.amount = value;
    }
 
    /** GETTER
     * Default Payment Method
     */
    @JsonGetter("default_payment_method")
    public String getDefaultPaymentMethod ( ) { 
        return this.defaultPaymentMethod;
    }
    
    /** SETTER
     * Default Payment Method
     */
    @JsonSetter("default_payment_method")
    public void setDefaultPaymentMethod (String value) { 
        this.defaultPaymentMethod = value;
    }
 
    /** GETTER
     * Gateway Affiliation Id
     */
    @JsonGetter("gateway_affiliation_id")
    public String getGatewayAffiliationId ( ) { 
        return this.gatewayAffiliationId;
    }
    
    /** SETTER
     * Gateway Affiliation Id
     */
    @JsonSetter("gateway_affiliation_id")
    public void setGatewayAffiliationId (String value) { 
        this.gatewayAffiliationId = value;
    }
 
}
 