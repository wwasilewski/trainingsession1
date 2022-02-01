package com.sda.parcel_locker.model;

import java.util.Arrays;

public class ParcelLocker {

    private int id;
    private String name;
    private Address address;
    private Package[] packages;

    public ParcelLocker(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public ParcelLocker(int id, String name, Address address, Package[] packages) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.packages = packages;
    }

    @Override
    public String toString() {
        return "ParcelLocker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", packages=" + Arrays.toString(packages) +
                '}';
    }
}
