/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateBankAccountRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4912934324784448397L;
    private String holderName;
    private String holderType;
    private String holderDocument;
    private String bank;
    private String branchNumber;
    private String branchCheckDigit;
    private String accountNumber;
    private String accountCheckDigit;
    private String type;
    private LinkedHashMap<String, String> metadata;
    /** GETTER
     * Bank account holder name
     */
    @JsonGetter("holder_name")
    public String getHolderName ( ) { 
        return this.holderName;
    }
    
    /** SETTER
     * Bank account holder name
     */
    @JsonSetter("holder_name")
    public void setHolderName (String value) { 
        this.holderName = value;
    }
 
    /** GETTER
     * Bank account holder type
     */
    @JsonGetter("holder_type")
    public String getHolderType ( ) { 
        return this.holderType;
    }
    
    /** SETTER
     * Bank account holder type
     */
    @JsonSetter("holder_type")
    public void setHolderType (String value) { 
        this.holderType = value;
    }
 
    /** GETTER
     * Bank account holder document
     */
    @JsonGetter("holder_document")
    public String getHolderDocument ( ) { 
        return this.holderDocument;
    }
    
    /** SETTER
     * Bank account holder document
     */
    @JsonSetter("holder_document")
    public void setHolderDocument (String value) { 
        this.holderDocument = value;
    }
 
    /** GETTER
     * Bank
     */
    @JsonGetter("bank")
    public String getBank ( ) { 
        return this.bank;
    }
    
    /** SETTER
     * Bank
     */
    @JsonSetter("bank")
    public void setBank (String value) { 
        this.bank = value;
    }
 
    /** GETTER
     * Branch number
     */
    @JsonGetter("branch_number")
    public String getBranchNumber ( ) { 
        return this.branchNumber;
    }
    
    /** SETTER
     * Branch number
     */
    @JsonSetter("branch_number")
    public void setBranchNumber (String value) { 
        this.branchNumber = value;
    }
 
    /** GETTER
     * Branch check digit
     */
    @JsonGetter("branch_check_digit")
    public String getBranchCheckDigit ( ) { 
        return this.branchCheckDigit;
    }
    
    /** SETTER
     * Branch check digit
     */
    @JsonSetter("branch_check_digit")
    public void setBranchCheckDigit (String value) { 
        this.branchCheckDigit = value;
    }
 
    /** GETTER
     * Account number
     */
    @JsonGetter("account_number")
    public String getAccountNumber ( ) { 
        return this.accountNumber;
    }
    
    /** SETTER
     * Account number
     */
    @JsonSetter("account_number")
    public void setAccountNumber (String value) { 
        this.accountNumber = value;
    }
 
    /** GETTER
     * Account check digit
     */
    @JsonGetter("account_check_digit")
    public String getAccountCheckDigit ( ) { 
        return this.accountCheckDigit;
    }
    
    /** SETTER
     * Account check digit
     */
    @JsonSetter("account_check_digit")
    public void setAccountCheckDigit (String value) { 
        this.accountCheckDigit = value;
    }
 
    /** GETTER
     * Bank account type
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * Bank account type
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
    /** GETTER
     * Metadata
     */
    @JsonGetter("metadata")
    public LinkedHashMap<String, String> getMetadata ( ) { 
        return this.metadata;
    }
    
    /** SETTER
     * Metadata
     */
    @JsonSetter("metadata")
    public void setMetadata (LinkedHashMap<String, String> value) { 
        this.metadata = value;
    }
 
}
 