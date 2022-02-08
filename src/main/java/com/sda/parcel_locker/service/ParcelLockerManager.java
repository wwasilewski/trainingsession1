package com.sda.parcel_locker.service;

import com.sda.parcel_locker.model.Address;
import com.sda.parcel_locker.model.ParcelLocker;

import java.util.ArrayList;
import java.util.List;

public class ParcelLockerManager {

    static List<ParcelLocker> parcelLockers = new ArrayList<>();

    public ParcelLockerManager() {
        initData();
    }

    public void initData() {
        parcelLockers.add(new ParcelLocker("SC1", new Address("Szczecinska", "Szczecin", "11-712")));
        parcelLockers.add(new ParcelLocker("WA2", new Address("Warszawska", "Warszawa", "22-712")));
        parcelLockers.add(new ParcelLocker("KR3", new Address("Krakowska", "Krakow", "33-712")));
        parcelLockers.add(new ParcelLocker("WR4", new Address("Wroclawska", "Wroclaw", "44-712")));
        parcelLockers.add(new ParcelLocker("GD5", new Address("Gdanska", "Gdansk", "55-712")));
    }

    public static ParcelLocker addLocker(String name, Address address) {
        ParcelLocker parcelLocker = new ParcelLocker(name, address);
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


    @Override
    public String toString() {
        return "ParcelLockerManager{" +
                "parcelLockers=" + parcelLockers +
                '}';
    }
}
