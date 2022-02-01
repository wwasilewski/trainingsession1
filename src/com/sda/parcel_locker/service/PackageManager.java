package com.sda.parcel_locker.service;

import com.sda.parcel_locker.model.Package;
import com.sda.parcel_locker.model.ParcelLocker;
import com.sda.parcel_locker.model.Size;
import com.sda.parcel_locker.model.State;

import java.util.ArrayList;
import java.util.List;

public class PackageManager {

    private List<Package> packages;

    public PackageManager() {
        this.packages = new ArrayList<>();
    }

    public void createPackage(int id, String name, Size size, int weight, String recipient,
                              String sender, ParcelLocker senderPL, ParcelLocker recipientPL,
                              State state) {
        packages.add(new Package(id, name, size, weight, recipient, sender, senderPL, recipientPL, state));
    }

    public void readPackages() {
        System.out.println(packages);
    }

//    public Package updatePackage(int id, String name) {
//        packages.set(id, packages.get(id).getName(name))
//    }

    public void deletePackage(int id) {
        packages.remove(id);
    }


}
