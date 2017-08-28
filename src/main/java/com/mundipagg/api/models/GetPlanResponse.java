/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetPlanResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5218663694868851277L;
    private String id;
    private String name;
    private String description;
    private String url;
    private String statementDescriptor;
    private String interval;
    private int intervalCount;
    private String billingType;
    private List<String> paymentMethods;
    private List<Integer> installments;
    private String status;
    private String currency;
    private Date createdAt;
    private Date updatedAt;
    private List<GetPlanItemResponse> items;
    private List<Integer> billingDays;
    private boolean shippable;
    private LinkedHashMap<String, String> metadata;
    private Integer trialPeriodDays;
    private Integer minimumPrice;
    private Date deletedAt;
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
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("url")
    public String getUrl ( ) { 
        return this.url;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("url")
    public void setUrl (String value) { 
        this.url = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("statement_descriptor")
    public String getStatementDescriptor ( ) { 
        return this.statementDescriptor;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("statement_descriptor")
    public void setStatementDescriptor (String value) { 
        this.statementDescriptor = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("interval")
    public String getInterval ( ) { 
        return this.interval;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("interval")
    public void setInterval (String value) { 
        this.interval = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("interval_count")
    public int getIntervalCount ( ) { 
        return this.intervalCount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("interval_count")
    public void setIntervalCount (int value) { 
        this.intervalCount = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("billing_type")
    public String getBillingType ( ) { 
        return this.billingType;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("billing_type")
    public void setBillingType (String value) { 
        this.billingType = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("payment_methods")
    public List<String> getPaymentMethods ( ) { 
        return this.paymentMethods;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("payment_methods")
    public void setPaymentMethods (List<String> value) { 
        this.paymentMethods = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("installments")
    public List<Integer> getInstallments ( ) { 
        return this.installments;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("installments")
    public void setInstallments (List<Integer> value) { 
        this.installments = value;
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
    @JsonGetter("currency")
    public String getCurrency ( ) { 
        return this.currency;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("currency")
    public void setCurrency (String value) { 
        this.currency = value;
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
    @JsonGetter("items")
    public List<GetPlanItemResponse> getItems ( ) { 
        return this.items;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("items")
    public void setItems (List<GetPlanItemResponse> value) { 
        this.items = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("billing_days")
    public List<Integer> getBillingDays ( ) { 
        return this.billingDays;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("billing_days")
    public void setBillingDays (List<Integer> value) { 
        this.billingDays = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("shippable")
    public boolean getShippable ( ) { 
        return this.shippable;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("shippable")
    public void setShippable (boolean value) { 
        this.shippable = value;
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
    @JsonGetter("trial_period_days")
    public Integer getTrialPeriodDays ( ) { 
        return this.trialPeriodDays;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("trial_period_days")
    public void setTrialPeriodDays (Integer value) { 
        this.trialPeriodDays = value;
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
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("deleted_at")
    public Date getDeletedAt ( ) { 
        return this.deletedAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("deleted_at")
    public void setDeletedAt (Date value) { 
        this.deletedAt = value;
    }
 
}
 