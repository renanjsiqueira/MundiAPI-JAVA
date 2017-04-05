/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ListUsagesResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5637840886946912597L;
    private List<String> data;
    private PagingResponse paging;
    /** GETTER
     * The usage objects
     */
    @JsonGetter("data")
    public List<String> getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * The usage objects
     */
    @JsonSetter("data")
    public void setData (List<String> value) { 
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
 