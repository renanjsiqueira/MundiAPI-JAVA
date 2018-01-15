/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateAddressRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5534114278210117704L;
    private String street;
    private String number;
    private String zipCode;
    private String neighborhood;
    private String city;
    private String state;
    private String country;
    private String complement;
    private LinkedHashMap<String, String> metadata;
    private String line1;
    private String line2;
    /** GETTER
     * Street
     */
    @JsonGetter("street")
    public String getStreet ( ) { 
        return this.street;
    }
    
    /** SETTER
     * Street
     */
    @JsonSetter("street")
    public void setStreet (String value) { 
        this.street = value;
    }
 
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
     * The zip code containing only numbers. No special characters or spaces.
     */
    @JsonGetter("zip_code")
    public String getZipCode ( ) { 
        return this.zipCode;
    }
    
    /** SETTER
     * The zip code containing only numbers. No special characters or spaces.
     */
    @JsonSetter("zip_code")
    public void setZipCode (String value) { 
        this.zipCode = value;
    }
 
    /** GETTER
     * Neighborhood
     */
    @JsonGetter("neighborhood")
    public String getNeighborhood ( ) { 
        return this.neighborhood;
    }
    
    /** SETTER
     * Neighborhood
     */
    @JsonSetter("neighborhood")
    public void setNeighborhood (String value) { 
        this.neighborhood = value;
    }
 
    /** GETTER
     * City
     */
    @JsonGetter("city")
    public String getCity ( ) { 
        return this.city;
    }
    
    /** SETTER
     * City
     */
    @JsonSetter("city")
    public void setCity (String value) { 
        this.city = value;
    }
 
    /** GETTER
     * State
     */
    @JsonGetter("state")
    public String getState ( ) { 
        return this.state;
    }
    
    /** SETTER
     * State
     */
    @JsonSetter("state")
    public void setState (String value) { 
        this.state = value;
    }
 
    /** GETTER
     * Country. Must be entered using ISO 3166-1 alpha-2 format. See https://pt.wikipedia.org/wiki/ISO_3166-1_alfa-2
     */
    @JsonGetter("country")
    public String getCountry ( ) { 
        return this.country;
    }
    
    /** SETTER
     * Country. Must be entered using ISO 3166-1 alpha-2 format. See https://pt.wikipedia.org/wiki/ISO_3166-1_alfa-2
     */
    @JsonSetter("country")
    public void setCountry (String value) { 
        this.country = value;
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
     * Line 1 for address
     */
    @JsonGetter("line_1")
    public String getLine1 ( ) { 
        return this.line1;
    }
    
    /** SETTER
     * Line 1 for address
     */
    @JsonSetter("line_1")
    public void setLine1 (String value) { 
        this.line1 = value;
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
 