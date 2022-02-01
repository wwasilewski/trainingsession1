package com.sda.parcel_locker;

import com.sda.parcel_locker.service.ParcelLockerManager;
import com.sda.parcel_locker.userinterface.UserInterface;

public class Main {

    private static ParcelLockerManager parcelLockerManager = new ParcelLockerManager();

    public static void main(String[] args) {
        UserInterface.showMenu();

//        parcelLockerManager.readPL();

    }


}
