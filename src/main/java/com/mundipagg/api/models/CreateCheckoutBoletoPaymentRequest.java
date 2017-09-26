/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateCheckoutBoletoPaymentRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4976216513285622650L;
    private String bank;
    private String instructions;
    private Date dueAt;
    /** GETTER
     * Bank identifier
     */
    @JsonGetter("bank")
    public String getBank ( ) { 
        return this.bank;
    }
    
    /** SETTER
     * Bank identifier
     */
    @JsonSetter("bank")
    public void setBank (String value) { 
        this.bank = value;
    }
 
    /** GETTER
     * Instructions
     */
    @JsonGetter("instructions")
    public String getInstructions ( ) { 
        return this.instructions;
    }
    
    /** SETTER
     * Instructions
     */
    @JsonSetter("instructions")
    public void setInstructions (String value) { 
        this.instructions = value;
    }
 
    /** GETTER
     * Due date
     */
    @JsonGetter("due_at")
    public Date getDueAt ( ) { 
        return this.dueAt;
    }
    
    /** SETTER
     * Due date
     */
    @JsonSetter("due_at")
    public void setDueAt (Date value) { 
        this.dueAt = value;
    }
 
}
 