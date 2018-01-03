/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetPricingSchemeResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4898152836358398727L;
    private int price;
    private String schemeType;
    private List<GetPriceBracketResponse> priceBrackets;
    private Integer minimumPrice;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("price")
    public int getPrice ( ) { 
        return this.price;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("price")
    public void setPrice (int value) { 
        this.price = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("scheme_type")
    public String getSchemeType ( ) { 
        return this.schemeType;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("scheme_type")
    public void setSchemeType (String value) { 
        this.schemeType = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("price_brackets")
    public List<GetPriceBracketResponse> getPriceBrackets ( ) { 
        return this.priceBrackets;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("price_brackets")
    public void setPriceBrackets (List<GetPriceBracketResponse> value) { 
        this.priceBrackets = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("minimum_price")
    public Integer getMinimumPrice ( ) { 
        return this.minimumPrice;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("minimum_price")
    public void setMinimumPrice (Integer value) { 
        this.minimumPrice = value;
    }
 
}
 