package com.sda.parcel_locker.service;

import com.sda.parcel_locker.model.Address;
import com.sda.parcel_locker.model.ParcelLocker;

import java.util.ArrayList;
import java.util.List;

public class PLManager {

    private List<ParcelLocker> parcelLockers;

    public PLManager() {
        this.parcelLockers = new ArrayList<>();
    }

    public void createPL(int id, String name, Address address) {
        parcelLockers.add(new ParcelLocker(id, name, address));
    }

    public void readPL() {
        System.out.println(parcelLockers);
    }

//    public ParcelLocker updatePL(int id, String name) {
//        parcelLockers.set(parcelLockers.get(id), parcelLockers.get(id).setName(name));
//    }

    public void deletePL(int id) {
        parcelLockers.remove(id);
    }

}
