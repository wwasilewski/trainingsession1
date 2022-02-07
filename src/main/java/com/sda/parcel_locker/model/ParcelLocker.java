package com.sda.parcel_locker.model;

import java.util.ArrayList;
import java.util.List;

public class ParcelLocker {

    private int id;
    private String name;
    private Address address;
    private List<Package> packages;

    public ParcelLocker(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.packages = new ArrayList<>();
    }

    public ParcelLocker(int id, String name, Address address, List<Package> packages) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.packages = packages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "ParcelLocker id:" + id + ",name: " + name;
    }
}
