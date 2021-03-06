package com.sda.parcel_locker.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ParcelLocker {

    private String id = UUID.randomUUID().toString();
    private String name;
    private Address address;
    private List<Package> packages;

    public ParcelLocker(String name) {
        this.name = name;
    }

    public ParcelLocker(String name, Address address) {
        this.name = name;
        this.address = address;
        this.packages = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Package> getPackages() {
        return packages;
    }

    public void setPackages(List<Package> packages) {
        this.packages = packages;
    }

    @Override
    public String toString() {
        return "ParcelLocker{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", packages=" + packages +
                '}';
    }
}
