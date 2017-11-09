/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateTokenRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4666687789287339852L;
    private String type = "card";
    private CreateCardTokenRequest card;
    /** GETTER
     * Token type
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * Token type
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
    /** GETTER
     * Card data
     */
    @JsonGetter("card")
    public CreateCardTokenRequest getCard ( ) { 
        return this.card;
    }
    
    /** SETTER
     * Card data
     */
    @JsonSetter("card")
    public void setCard (CreateCardTokenRequest value) { 
        this.card = value;
    }
 
}
 