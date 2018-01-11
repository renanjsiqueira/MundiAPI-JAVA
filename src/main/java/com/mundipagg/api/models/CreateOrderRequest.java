/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateOrderRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4903829664842242926L;
    private List<CreateOrderItemRequest> items;
    private CreateCustomerRequest customer;
    private List<CreatePaymentRequest> payments;
    private String code;
    private String customerId;
    private CreateShippingRequest shipping;
    private LinkedHashMap<String, String> metadata;
    private boolean closed = true;
    private Boolean antifraudEnabled;
    private String ip;
    private String sessionId;
    private CreateLocationRequest location;
    private CreateDeviceRequest device;
    /** GETTER
     * Items
     */
    @JsonGetter("items")
    public List<CreateOrderItemRequest> getItems ( ) { 
        return this.items;
    }
    
    /** SETTER
     * Items
     */
    @JsonSetter("items")
    public void setItems (List<CreateOrderItemRequest> value) { 
        this.items = value;
    }
 
    /** GETTER
     * Customer
     */
    @JsonGetter("customer")
    public CreateCustomerRequest getCustomer ( ) { 
        return this.customer;
    }
    
    /** SETTER
     * Customer
     */
    @JsonSetter("customer")
    public void setCustomer (CreateCustomerRequest value) { 
        this.customer = value;
    }
 
    /** GETTER
     * Payment data
     */
    @JsonGetter("payments")
    public List<CreatePaymentRequest> getPayments ( ) { 
        return this.payments;
    }
    
    /** SETTER
     * Payment data
     */
    @JsonSetter("payments")
    public void setPayments (List<CreatePaymentRequest> value) { 
        this.payments = value;
    }
 
    /** GETTER
     * The order code
     */
    @JsonGetter("code")
    public String getCode ( ) { 
        return this.code;
    }
    
    /** SETTER
     * The order code
     */
    @JsonSetter("code")
    public void setCode (String value) { 
        this.code = value;
    }
 
    /** GETTER
     * The customer id
     */
    @JsonGetter("customer_id")
    public String getCustomerId ( ) { 
        return this.customerId;
    }
    
    /** SETTER
     * The customer id
     */
    @JsonSetter("customer_id")
    public void setCustomerId (String value) { 
        this.customerId = value;
    }
 
    /** GETTER
     * Shipping data
     */
    @JsonGetter("shipping")
    public CreateShippingRequest getShipping ( ) { 
        return this.shipping;
    }
    
    /** SETTER
     * Shipping data
     */
    @JsonSetter("shipping")
    public void setShipping (CreateShippingRequest value) { 
        this.shipping = value;
    }
 
    /** GETTER
     * Metadata
     */
    @JsonGetter("metadata")
    public LinkedHashMap<String, String> getMetadata ( ) { 
        return this.metadata;
    }
    
    /** SETTER
     * Metadata
     */
    @JsonSetter("metadata")
    public void setMetadata (LinkedHashMap<String, String> value) { 
        this.metadata = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("closed")
    public boolean getClosed ( ) { 
        return this.closed;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("closed")
    public void setClosed (boolean value) { 
        this.closed = value;
    }
 
    /** GETTER
     * Defines whether the order will go through anti-fraud
     */
    @JsonGetter("antifraud_enabled")
    public Boolean getAntifraudEnabled ( ) { 
        return this.antifraudEnabled;
    }
    
    /** SETTER
     * Defines whether the order will go through anti-fraud
     */
    @JsonSetter("antifraud_enabled")
    public void setAntifraudEnabled (Boolean value) { 
        this.antifraudEnabled = value;
    }
 
    /** GETTER
     * Ip address
     */
    @JsonGetter("ip")
    public String getIp ( ) { 
        return this.ip;
    }
    
    /** SETTER
     * Ip address
     */
    @JsonSetter("ip")
    public void setIp (String value) { 
        this.ip = value;
    }
 
    /** GETTER
     * Session id
     */
    @JsonGetter("session_id")
    public String getSessionId ( ) { 
        return this.sessionId;
    }
    
    /** SETTER
     * Session id
     */
    @JsonSetter("session_id")
    public void setSessionId (String value) { 
        this.sessionId = value;
    }
 
    /** GETTER
     * Request's location
     */
    @JsonGetter("location")
    public CreateLocationRequest getLocation ( ) { 
        return this.location;
    }
    
    /** SETTER
     * Request's location
     */
    @JsonSetter("location")
    public void setLocation (CreateLocationRequest value) { 
        this.location = value;
    }
 
    /** GETTER
     * Device's informations
     */
    @JsonGetter("device")
    public CreateDeviceRequest getDevice ( ) { 
        return this.device;
    }
    
    /** SETTER
     * Device's informations
     */
    @JsonSetter("device")
    public void setDevice (CreateDeviceRequest value) { 
        this.device = value;
    }
 
}
 