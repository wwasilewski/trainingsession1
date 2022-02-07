package com.sda.parcel_locker.model;

public enum State {
    PRE("Prepared"),
    SENT("Sent"),
    DELIV("Delivered");

    private String fullName;

    State(String fullName) {
        this.fullName = fullName;
    }
}
