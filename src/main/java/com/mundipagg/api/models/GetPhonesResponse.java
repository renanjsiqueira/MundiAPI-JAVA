/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetPhonesResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5726012176458202760L;
    private GetPhoneResponse homePhone;
    private GetPhoneResponse mobilePhone;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("home_phone")
    public GetPhoneResponse getHomePhone ( ) { 
        return this.homePhone;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("home_phone")
    public void setHomePhone (GetPhoneResponse value) { 
        this.homePhone = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("mobile_phone")
    public GetPhoneResponse getMobilePhone ( ) { 
        return this.mobilePhone;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("mobile_phone")
    public void setMobilePhone (GetPhoneResponse value) { 
        this.mobilePhone = value;
    }
 
}
 