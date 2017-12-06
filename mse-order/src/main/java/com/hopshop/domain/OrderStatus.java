package com.hopshop.domain;

/**
 * Created by rohith on 7/12/17.
 */
public enum OrderStatus {

    INITIATED("initiated"),
    PROCESSED("processed"),
    CREATED("created"),
    SHIPPED("shipped"),
    DELIVERED("deliveed"),
    RETURNED("returned");

    private final String description;

    OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }


}
