/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.exceptions;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.mundipagg.api.http.client.HttpContext;

public class ErrorException 
        extends APIException
        implements java.io.Serializable {
    private static final long serialVersionUID = 4674469150546603343L;
    private String message;
    private Object errors;
    private Object request;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("message")
    public String getMessage ( ) { 
        return this.message;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("message")
    private void setMessage (String value) { 
        this.message = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("errors")
    public Object getErrors ( ) { 
        return this.errors;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("errors")
    private void setErrors (Object value) { 
        this.errors = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("request")
    public Object getRequest ( ) { 
        return this.request;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("request")
    private void setRequest (Object value) { 
        this.request = value;
    }
 
    /**
     * Initialization constructor
     * @param   reason  The reason for throwing exception
     * @param   context The http context of the API exception
     */
    public ErrorException(String reason, HttpContext context) {
        super(reason, context);
    }
}
 