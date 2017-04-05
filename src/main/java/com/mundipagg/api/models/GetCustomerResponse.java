/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetCustomerResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4644938549960137192L;
    private String id;
    private String name;
    private String email;
    private boolean delinquent;
    private Date createdAt;
    private Date updatedAt;
    private String phone;
    private String document;
    private String personType;
    private String fbAccessToken;
    private GetAddressResponse address;
    private LinkedHashMap<String, String> metadata;
    private Long fbId;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("email")
    public String getEmail ( ) { 
        return this.email;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("email")
    public void setEmail (String value) { 
        this.email = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("delinquent")
    public boolean getDelinquent ( ) { 
        return this.delinquent;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("delinquent")
    public void setDelinquent (boolean value) { 
        this.delinquent = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("created_at")
    public Date getCreatedAt ( ) { 
        return this.createdAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("created_at")
    public void setCreatedAt (Date value) { 
        this.createdAt = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("updated_at")
    public Date getUpdatedAt ( ) { 
        return this.updatedAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("updated_at")
    public void setUpdatedAt (Date value) { 
        this.updatedAt = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("phone")
    public String getPhone ( ) { 
        return this.phone;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("phone")
    public void setPhone (String value) { 
        this.phone = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("document")
    public String getDocument ( ) { 
        return this.document;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("document")
    public void setDocument (String value) { 
        this.document = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("person_type")
    public String getPersonType ( ) { 
        return this.personType;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("person_type")
    public void setPersonType (String value) { 
        this.personType = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("fb_access_token")
    public String getFbAccessToken ( ) { 
        return this.fbAccessToken;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("fb_access_token")
    public void setFbAccessToken (String value) { 
        this.fbAccessToken = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("address")
    public GetAddressResponse getAddress ( ) { 
        return this.address;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("address")
    public void setAddress (GetAddressResponse value) { 
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
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("fb_id")
    public Long getFbId ( ) { 
        return this.fbId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("fb_id")
    public void setFbId (Long value) { 
        this.fbId = value;
    }
 
}
 