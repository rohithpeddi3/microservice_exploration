package com.hopshop.enums;

/**
 * Created by rohith on 6/12/17.
 */
public enum CartStatus {

    ACTIVE("active"),
    COMPLETE("complete");

    private final String description;

    CartStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }


}
