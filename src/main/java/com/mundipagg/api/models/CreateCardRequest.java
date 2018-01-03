/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateCardRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5599734617792836060L;
    private String number;
    private String holderName;
    private int expMonth;
    private int expYear;
    private String cvv;
    private CreateAddressRequest billingAddress;
    private String brand;
    private String billingAddressId;
    private LinkedHashMap<String, String> metadata;
    private String type = "credit";
    private CreateCardOptionsRequest options;
    private String holderDocument;
    private boolean privateLabel;
    /** GETTER
     * Credit card number
     */
    @JsonGetter("number")
    public String getNumber ( ) { 
        return this.number;
    }
    
    /** SETTER
     * Credit card number
     */
    @JsonSetter("number")
    public void setNumber (String value) { 
        this.number = value;
    }
 
    /** GETTER
     * Holder name, as written on the card
     */
    @JsonGetter("holder_name")
    public String getHolderName ( ) { 
        return this.holderName;
    }
    
    /** SETTER
     * Holder name, as written on the card
     */
    @JsonSetter("holder_name")
    public void setHolderName (String value) { 
        this.holderName = value;
    }
 
    /** GETTER
     * The expiration month
     */
    @JsonGetter("exp_month")
    public int getExpMonth ( ) { 
        return this.expMonth;
    }
    
    /** SETTER
     * The expiration month
     */
    @JsonSetter("exp_month")
    public void setExpMonth (int value) { 
        this.expMonth = value;
    }
 
    /** GETTER
     * The expiration year, that can be informed with 2 or 4 digits
     */
    @JsonGetter("exp_year")
    public int getExpYear ( ) { 
        return this.expYear;
    }
    
    /** SETTER
     * The expiration year, that can be informed with 2 or 4 digits
     */
    @JsonSetter("exp_year")
    public void setExpYear (int value) { 
        this.expYear = value;
    }
 
    /** GETTER
     * The card's security code
     */
    @JsonGetter("cvv")
    public String getCvv ( ) { 
        return this.cvv;
    }
    
    /** SETTER
     * The card's security code
     */
    @JsonSetter("cvv")
    public void setCvv (String value) { 
        this.cvv = value;
    }
 
    /** GETTER
     * Card's billing address
     */
    @JsonGetter("billing_address")
    public CreateAddressRequest getBillingAddress ( ) { 
        return this.billingAddress;
    }
    
    /** SETTER
     * Card's billing address
     */
    @JsonSetter("billing_address")
    public void setBillingAddress (CreateAddressRequest value) { 
        this.billingAddress = value;
    }
 
    /** GETTER
     * Card brand
     */
    @JsonGetter("brand")
    public String getBrand ( ) { 
        return this.brand;
    }
    
    /** SETTER
     * Card brand
     */
    @JsonSetter("brand")
    public void setBrand (String value) { 
        this.brand = value;
    }
 
    /** GETTER
     * The address id for the billing address
     */
    @JsonGetter("billing_address_id")
    public String getBillingAddressId ( ) { 
        return this.billingAddressId;
    }
    
    /** SETTER
     * The address id for the billing address
     */
    @JsonSetter("billing_address_id")
    public void setBillingAddressId (String value) { 
        this.billingAddressId = value;
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
     * Card type
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * Card type
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
    /** GETTER
     * Options for creating the card
     */
    @JsonGetter("options")
    public CreateCardOptionsRequest getOptions ( ) { 
        return this.options;
    }
    
    /** SETTER
     * Options for creating the card
     */
    @JsonSetter("options")
    public void setOptions (CreateCardOptionsRequest value) { 
        this.options = value;
    }
 
    /** GETTER
     * Document number for the card's holder
     */
    @JsonGetter("holder_document")
    public String getHolderDocument ( ) { 
        return this.holderDocument;
    }
    
    /** SETTER
     * Document number for the card's holder
     */
    @JsonSetter("holder_document")
    public void setHolderDocument (String value) { 
        this.holderDocument = value;
    }
 
    /** GETTER
     * Indicates whether it is a private label card
     */
    @JsonGetter("private_label")
    public boolean getPrivateLabel ( ) { 
        return this.privateLabel;
    }
    
    /** SETTER
     * Indicates whether it is a private label card
     */
    @JsonSetter("private_label")
    public void setPrivateLabel (boolean value) { 
        this.privateLabel = value;
    }
 
}
 