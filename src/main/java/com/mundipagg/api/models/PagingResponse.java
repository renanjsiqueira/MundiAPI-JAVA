/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PagingResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5537997867831962798L;
    private int total;
    private String previous;
    private String next;
    /** GETTER
     * Total number of pages
     */
    @JsonGetter("total")
    public int getTotal ( ) { 
        return this.total;
    }
    
    /** SETTER
     * Total number of pages
     */
    @JsonSetter("total")
    public void setTotal (int value) { 
        this.total = value;
    }
 
    /** GETTER
     * Previous page
     */
    @JsonGetter("previous")
    public String getPrevious ( ) { 
        return this.previous;
    }
    
    /** SETTER
     * Previous page
     */
    @JsonSetter("previous")
    public void setPrevious (String value) { 
        this.previous = value;
    }
 
    /** GETTER
     * Next page
     */
    @JsonGetter("next")
    public String getNext ( ) { 
        return this.next;
    }
    
    /** SETTER
     * Next page
     */
    @JsonSetter("next")
    public void setNext (String value) { 
        this.next = value;
    }
 
}
 