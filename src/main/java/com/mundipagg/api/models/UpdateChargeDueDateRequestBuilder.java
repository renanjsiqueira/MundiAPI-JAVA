/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class UpdateChargeDueDateRequestBuilder {
    //the instance to build
    private UpdateChargeDueDateRequest updateChargeDueDateRequest;

    /**
     * Default constructor to initialize the instance
     */
    public UpdateChargeDueDateRequestBuilder() {
        updateChargeDueDateRequest = new UpdateChargeDueDateRequest();
    }

    /**
     * The charge's new due date
     */
    public UpdateChargeDueDateRequestBuilder dueAt(Date dueAt) {
        updateChargeDueDateRequest.setDueAt(dueAt);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UpdateChargeDueDateRequest build() {
        return updateChargeDueDateRequest;
    }
}