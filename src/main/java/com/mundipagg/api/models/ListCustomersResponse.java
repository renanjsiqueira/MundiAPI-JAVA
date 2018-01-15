/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ListCustomersResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4800971872357172258L;
    private List<GetCustomerResponse> data;
    private PagingResponse paging;
    /** GETTER
     * The customer object
     */
    @JsonGetter("data")
    public List<GetCustomerResponse> getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * The customer object
     */
    @JsonSetter("data")
    public void setData (List<GetCustomerResponse> value) { 
        this.data = value;
    }
 
    /** GETTER
     * Paging object
     */
    @JsonGetter("paging")
    public PagingResponse getPaging ( ) { 
        return this.paging;
    }
    
    /** SETTER
     * Paging object
     */
    @JsonSetter("paging")
    public void setPaging (PagingResponse value) { 
        this.paging = value;
    }
 
}
 