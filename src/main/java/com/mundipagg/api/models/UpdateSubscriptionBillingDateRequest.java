/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UpdateSubscriptionBillingDateRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5298573694087131227L;
    private Date nextBillingAt;
    /** GETTER
     * The date when the next subscription billing must occur
     */
    @JsonGetter("next_billing_at")
    public Date getNextBillingAt ( ) { 
        return this.nextBillingAt;
    }
    
    /** SETTER
     * The date when the next subscription billing must occur
     */
    @JsonSetter("next_billing_at")
    public void setNextBillingAt (Date value) { 
        this.nextBillingAt = value;
    }
 
}
 