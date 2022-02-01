package com.sda.parcel_locker;

import com.sda.parcel_locker.model.*;
import com.sda.parcel_locker.model.Package;

public class Main {

    public static void main(String[] args) {

        ParcelLocker pl1 = new ParcelLocker(1, "SCZ11", new Address("street", "oslo", "727712"), new Package[]{});
        ParcelLocker pl2 = new ParcelLocker(2, "SCZ22", new Address("street", "oslo", "727712"), new Package[]{});
        System.out.println(pl1);

        Package p1 = new Package(1, "pack1", Size.M, 12, "Tom D", "Jack A", pl1, pl2, State.PREPARING);
        System.out.println(p1);
    }
}
