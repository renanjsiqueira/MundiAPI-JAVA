/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UpdateAddressRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5295540652921254879L;
    private String number;
    private String complement;
    private LinkedHashMap<String, String> metadata;
    private String line2;
    /** GETTER
     * Number
     */
    @JsonGetter("number")
    public String getNumber ( ) { 
        return this.number;
    }
    
    /** SETTER
     * Number
     */
    @JsonSetter("number")
    public void setNumber (String value) { 
        this.number = value;
    }
 
    /** GETTER
     * Complement
     */
    @JsonGetter("complement")
    public String getComplement ( ) { 
        return this.complement;
    }
    
    /** SETTER
     * Complement
     */
    @JsonSetter("complement")
    public void setComplement (String value) { 
        this.complement = value;
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
     * Line 2 for address
     */
    @JsonGetter("line_2")
    public String getLine2 ( ) { 
        return this.line2;
    }
    
    /** SETTER
     * Line 2 for address
     */
    @JsonSetter("line_2")
    public void setLine2 (String value) { 
        this.line2 = value;
    }
 
}
 