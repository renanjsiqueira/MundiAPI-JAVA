/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateCheckoutPaymentRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4668649107177386120L;
    private List<String> acceptedPaymentMethods;
    private String successUrl;
    private String defaultPaymentMethod;
    private String gatewayAffiliationId;
    private CreateCheckoutCardPaymentRequest creditCard;
    private CreateCheckoutBoletoPaymentRequest boleto;
    private Boolean customerEditable;
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
     * Success url
     */
    @JsonGetter("success_url")
    public String getSuccessUrl ( ) { 
        return this.successUrl;
    }
    
    /** SETTER
     * Success url
     */
    @JsonSetter("success_url")
    public void setSuccessUrl (String value) { 
        this.successUrl = value;
    }
 
    /** GETTER
     * Default payment method
     */
    @JsonGetter("default_payment_method")
    public String getDefaultPaymentMethod ( ) { 
        return this.defaultPaymentMethod;
    }
    
    /** SETTER
     * Default payment method
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
 
    /** GETTER
     * Card payment request
     */
    @JsonGetter("credit_card")
    public CreateCheckoutCardPaymentRequest getCreditCard ( ) { 
        return this.creditCard;
    }
    
    /** SETTER
     * Card payment request
     */
    @JsonSetter("credit_card")
    public void setCreditCard (CreateCheckoutCardPaymentRequest value) { 
        this.creditCard = value;
    }
 
    /** GETTER
     * Boleto payment request
     */
    @JsonGetter("boleto")
    public CreateCheckoutBoletoPaymentRequest getBoleto ( ) { 
        return this.boleto;
    }
    
    /** SETTER
     * Boleto payment request
     */
    @JsonSetter("boleto")
    public void setBoleto (CreateCheckoutBoletoPaymentRequest value) { 
        this.boleto = value;
    }
 
    /** GETTER
     * Torna o objeto editável
     */
    @JsonGetter("customer_editable")
    public Boolean getCustomerEditable ( ) { 
        return this.customerEditable;
    }
    
    /** SETTER
     * Torna o objeto editável
     */
    @JsonSetter("customer_editable")
    public void setCustomerEditable (Boolean value) { 
        this.customerEditable = value;
    }
 
}
 