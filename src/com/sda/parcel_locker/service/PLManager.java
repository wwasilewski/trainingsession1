package com.sda.parcel_locker.service;

import com.sda.parcel_locker.model.Package;
import com.sda.parcel_locker.model.ParcelLocker;

public class PLManager {

    private ParcelLocker[] parcelLockers;
    private Package[] packages;

    public PLManager(ParcelLocker[] parcelLockers, Package[] packages) {
        this.parcelLockers = parcelLockers;
        this.packages = packages;
    }

    public void addParcelLocker(){

    }

}
