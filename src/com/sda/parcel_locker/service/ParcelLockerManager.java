package com.sda.parcel_locker.service;

import com.sda.parcel_locker.model.Address;
import com.sda.parcel_locker.model.ParcelLocker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParcelLockerManager {

    private Scanner sc = new Scanner(System.in);
    private List<ParcelLocker> parcelLockers;

    public ParcelLockerManager() {
        this.parcelLockers = new ArrayList<>();
        parcelLockers.add(new ParcelLocker(1, "SC1", new Address("Szczecinska", "Szczecin", "11-712")));
        parcelLockers.add(new ParcelLocker(2, "WA2", new Address("Warszawska", "Warszawa", "22-712")));
        parcelLockers.add(new ParcelLocker(3, "KR3", new Address("Krakowska", "Krakow", "33-712")));
        parcelLockers.add(new ParcelLocker(4, "WR4", new Address("Wroclawska", "Wroclaw", "44-712")));
        parcelLockers.add(new ParcelLocker(5, "GD5", new Address("Gdanska", "Gdansk", "55-712")));
    }

    public void createPL() {
        System.out.println("Provide id: ");
        int id = sc.nextInt();
        System.out.println("Provide name: ");
        String name = sc.next();
        System.out.println("Now address, provide street:");
        String street = sc.next();
        System.out.println("Provide city: ");
        String city = sc.next();
        System.out.println("Provide postalCode: ");
        String postalCode = sc.next();
        parcelLockers.add(new ParcelLocker(id, name, new Address(street, city, postalCode)));
        System.out.println("Parcel Locker created");
    }

    public void readPL() {
        System.out.println("All Parcel Lockers: ");
        System.out.println(parcelLockers);
        System.out.println("What to do now?");
    }

    public void updatePL() {
        System.out.println("Updating Parcel Locker: ");
        System.out.println("Provide id: ");
        int id = sc.nextInt();
        System.out.println("Provide name: ");
        String name = sc.next();
        parcelLockers.get(id - 1).setName(name);
        System.out.println("Parcel Locker updated");
    }

    public void deletePL() {
        System.out.println("Provide id: ");
        int id = sc.nextInt();
        parcelLockers.remove(id);
        System.out.println("Parcel Locker deleted");
    }
}
