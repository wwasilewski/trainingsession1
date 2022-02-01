package com.sda.parcel_locker;

import com.sda.parcel_locker.model.*;
import com.sda.parcel_locker.service.PLManager;
import com.sda.parcel_locker.userinterface.UserInterface;

public class Main {

    public static void main(String[] args) {

        ParcelLocker pl1 = new ParcelLocker(1, "SCZ11", new Address("street", "oslo", "727712"));
//        ParcelLocker pl2 = new ParcelLocker(2, "SCZ22", new Address("street", "oslo", "727712"));
//        System.out.println(pl1);
//
//        Package p1 = new Package(1, "pack1", Size.M, 12, "Tom D", "Jack A", pl1, pl2, State.PREPARING);
//        System.out.println(p1);

        PLManager pl = new PLManager();
        pl.createPL(1, "SCZ11", new Address("street", "oslo", "1111"));
        pl.createPL(2, "SCZ22", new Address("street", "opole", "2222"));


        pl.readPL();
        pl.deletePL(1);

        System.out.println("after removing:");
        pl.readPL();

        UserInterface userInterface = new UserInterface();
        userInterface.showMenu();
    }

}
