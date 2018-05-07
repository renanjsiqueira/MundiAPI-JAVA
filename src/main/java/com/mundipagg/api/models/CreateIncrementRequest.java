/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateIncrementRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5413524312687535110L;
    private double value;
    private String incrementType;
    private String itemId;
    private Integer cycles;
    private String description;
    /** GETTER
     * The increment value
     */
    @JsonGetter("value")
    public double getValue ( ) { 
        return this.value;
    }
    
    /** SETTER
     * The increment value
     */
    @JsonSetter("value")
    public void setValue (double value) { 
        this.value = value;
    }
 
    /** GETTER
     * Increment type. Can be either flat or percentage.
     */
    @JsonGetter("increment_type")
    public String getIncrementType ( ) { 
        return this.incrementType;
    }
    
    /** SETTER
     * Increment type. Can be either flat or percentage.
     */
    @JsonSetter("increment_type")
    public void setIncrementType (String value) { 
        this.incrementType = value;
    }
 
    /** GETTER
     * The item where the increment will be applied
     */
    @JsonGetter("item_id")
    public String getItemId ( ) { 
        return this.itemId;
    }
    
    /** SETTER
     * The item where the increment will be applied
     */
    @JsonSetter("item_id")
    public void setItemId (String value) { 
        this.itemId = value;
    }
 
    /** GETTER
     * Number of cycles that the increment will be applied
     */
    @JsonGetter("cycles")
    public Integer getCycles ( ) { 
        return this.cycles;
    }
    
    /** SETTER
     * Number of cycles that the increment will be applied
     */
    @JsonSetter("cycles")
    public void setCycles (Integer value) { 
        this.cycles = value;
    }
 
    /** GETTER
     * Description
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * Description
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
}
 