/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UpdateRecipientBankAccountRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4777223964522047478L;
    private CreateBankAccountRequest bankAccount;
    /** GETTER
     * Bank account
     */
    @JsonGetter("bank_account")
    public CreateBankAccountRequest getBankAccount ( ) { 
        return this.bankAccount;
    }
    
    /** SETTER
     * Bank account
     */
    @JsonSetter("bank_account")
    public void setBankAccount (CreateBankAccountRequest value) { 
        this.bankAccount = value;
    }
 
}
 