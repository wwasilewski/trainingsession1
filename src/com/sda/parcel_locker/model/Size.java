package com.sda.parcel_locker.model;

public enum Size {
    S("small"),
    M("medium"),
    L("large"),
    XL("extra-large");

    private String fullName;

    Size(String fullName) {
        this.fullName = fullName;
    }
}
