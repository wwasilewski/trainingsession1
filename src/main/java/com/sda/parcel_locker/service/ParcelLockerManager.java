package com.sda.parcel_locker.service;

import com.sda.parcel_locker.model.Address;
import com.sda.parcel_locker.model.Package;
import com.sda.parcel_locker.model.ParcelLocker;
import com.sda.parcel_locker.model.Size;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParcelLockerManager {

    static List<ParcelLocker> parcelLockers = new ArrayList<>();

    public ParcelLockerManager() {
        initData();
    }

    public void initData() {
        ParcelLocker p1 = new ParcelLocker("SC1", new Address("Szczecinska", "Szczecin", "11-712"));
        ParcelLocker p2 = new ParcelLocker("WA2", new Address("Warszawska", "Warszawa", "22-712"));

//        parcelLockers.add(new ParcelLocker("SC1", new Address("Szczecinska", "Szczecin", "11-712")));
//        parcelLockers.add(new ParcelLocker("WA2", new Address("Warszawska", "Warszawa", "22-712")));
//        parcelLockers.add(new ParcelLocker("KR3", new Address("Krakowska", "Krakow", "33-712")));
//        parcelLockers.add(new ParcelLocker("WR4", new Address("Wroclawska", "Wroclaw", "44-712")));
//        parcelLockers.add(new ParcelLocker("GD5", new Address("Gdanska", "Gdansk", "55-712")));
//        Package package1 = new Package("PACK1", Size.S, 1, "Tom", "Jack", p1, p2);
//        Package package2 = new Package("PACK2", Size.M, 1, "Tom", "Jack", p2, p1);


//        p1.setPackages(Arrays.asList(package1, package2));
        parcelLockers.add(p1);
        parcelLockers.add(p2);
    }

    public static ParcelLocker addLocker(ParcelLocker parcelLocker) {
        parcelLockers.add(parcelLocker);
        return parcelLocker;
    }

    public static void showLockers() {
        for (ParcelLocker parcelLocker : parcelLockers) {
            System.out.println(parcelLocker);
        }
    }

    public static boolean removeLocker(String id) {
        for (ParcelLocker parcelLocker : parcelLockers) {
            if (parcelLocker.getId().equals(id)) {
                parcelLockers.remove(parcelLocker);
                return true;
            }
        }
        return false;
    }

    public static void showLockersByCity(String city) {
        for (ParcelLocker parcelLocker : parcelLockers) {
            if (parcelLocker.getAddress().getCity().equals(city)) {
                System.out.println(parcelLocker);
            }
        }
    }

    public static boolean updateLockerName(String id, String newName) {
        for (ParcelLocker parcelLocker : parcelLockers) {
            if (parcelLocker.getId().equals(id)) {
                parcelLocker.setName(newName);
                return true;
            }
        }
        return false;
    }

    public static boolean updateLockerAddress(String id, Address newAddress) {
        for (ParcelLocker parcelLocker : parcelLockers) {
            if (parcelLocker.getId().equals(id)) {
                parcelLocker.setAddress(newAddress);
                return true;
            }
        }
        return false;
    }

    public static Package addPackage(Package newPackage) {
        for (ParcelLocker parcelLocker : parcelLockers) {
            if (parcelLocker.getName().equals(newPackage.getSenderPL().getName())) {
                parcelLocker.getPackages().add(newPackage);
                break;
            }
        }
        return newPackage;
    }

    public static void showPackages(String lockerId) {
        for (ParcelLocker parcelLocker : parcelLockers) {
            if (lockerId.equals(parcelLocker.getId())) {
                System.out.println(parcelLocker.getPackages());
            }
        }
    }

    @Override
    public String toString() {
        return "ParcelLockerManager{" +
                "parcelLockers=" + parcelLockers +
                '}';
    }
}
