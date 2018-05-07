/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UpdateSellerRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4685900100721697756L;
    private String name;
    private String code;
    private String description;
    private String document;
    private String status;
    private String type;
    private CreateAddressRequest address;
    private LinkedHashMap<String, String> metadata;
    /** GETTER
     * Seller name
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * Seller name
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * Seller code
     */
    @JsonGetter("code")
    public String getCode ( ) { 
        return this.code;
    }
    
    /** SETTER
     * Seller code
     */
    @JsonSetter("code")
    public void setCode (String value) { 
        this.code = value;
    }
 
    /** GETTER
     * Seller description
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * Seller description
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * Seller document CPF or CNPJ
     */
    @JsonGetter("document")
    public String getDocument ( ) { 
        return this.document;
    }
    
    /** SETTER
     * Seller document CPF or CNPJ
     */
    @JsonSetter("document")
    public void setDocument (String value) { 
        this.document = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("status")
    public String getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("status")
    public void setStatus (String value) { 
        this.status = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("address")
    public CreateAddressRequest getAddress ( ) { 
        return this.address;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("address")
    public void setAddress (CreateAddressRequest value) { 
        this.address = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("metadata")
    public LinkedHashMap<String, String> getMetadata ( ) { 
        return this.metadata;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("metadata")
    public void setMetadata (LinkedHashMap<String, String> value) { 
        this.metadata = value;
    }
 
}
 