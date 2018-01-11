/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetGatewayRecipientResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5361262322184597117L;
    private String gateway;
    private String status;
    private String pgid;
    private String createdAt;
    private String updatedAt;
    /** GETTER
     * Gateway name
     */
    @JsonGetter("gateway")
    public String getGateway ( ) { 
        return this.gateway;
    }
    
    /** SETTER
     * Gateway name
     */
    @JsonSetter("gateway")
    public void setGateway (String value) { 
        this.gateway = value;
    }
 
    /** GETTER
     * Status of the recipient on the gateway
     */
    @JsonGetter("status")
    public String getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * Status of the recipient on the gateway
     */
    @JsonSetter("status")
    public void setStatus (String value) { 
        this.status = value;
    }
 
    /** GETTER
     * Recipient id on the gateway
     */
    @JsonGetter("pgid")
    public String getPgid ( ) { 
        return this.pgid;
    }
    
    /** SETTER
     * Recipient id on the gateway
     */
    @JsonSetter("pgid")
    public void setPgid (String value) { 
        this.pgid = value;
    }
 
    /** GETTER
     * Creation date
     */
    @JsonGetter("created_at")
    public String getCreatedAt ( ) { 
        return this.createdAt;
    }
    
    /** SETTER
     * Creation date
     */
    @JsonSetter("created_at")
    public void setCreatedAt (String value) { 
        this.createdAt = value;
    }
 
    /** GETTER
     * Last update date
     */
    @JsonGetter("updated_at")
    public String getUpdatedAt ( ) { 
        return this.updatedAt;
    }
    
    /** SETTER
     * Last update date
     */
    @JsonSetter("updated_at")
    public void setUpdatedAt (String value) { 
        this.updatedAt = value;
    }
 
}
 