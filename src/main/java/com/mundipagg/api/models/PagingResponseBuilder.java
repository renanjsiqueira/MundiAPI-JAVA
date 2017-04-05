/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class PagingResponseBuilder {
    //the instance to build
    private PagingResponse pagingResponse;

    /**
     * Default constructor to initialize the instance
     */
    public PagingResponseBuilder() {
        pagingResponse = new PagingResponse();
    }

    /**
     * Total number of pages
     */
    public PagingResponseBuilder total(int total) {
        pagingResponse.setTotal(total);
        return this;
    }

    /**
     * Previous page
     */
    public PagingResponseBuilder previous(String previous) {
        pagingResponse.setPrevious(previous);
        return this;
    }

    /**
     * Next page
     */
    public PagingResponseBuilder next(String next) {
        pagingResponse.setNext(next);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public PagingResponse build() {
        return pagingResponse;
    }
}