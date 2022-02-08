package com.sda.parcel_locker.userinterface;

import com.sda.parcel_locker.model.Address;
import com.sda.parcel_locker.service.PackageManager;
import com.sda.parcel_locker.service.ParcelLockerManager;

import java.util.Scanner;

public class UserInterface {

    private static Scanner sc = new Scanner(System.in);
    private static ParcelLockerManager parcelLockerManager = new ParcelLockerManager();

    private static PackageManager packageManager = new PackageManager();
    private static String choice;

    public static void showMenu() {
        do {
            System.out.println("[1] Show Parcel Locker Menu");
            System.out.println("[2] Show Package Menu");
            System.out.println("[0] EXIT");

            choice = sc.next();
            switch (choice) {
                case "1" -> showPLMenu();
                case "2" -> showPackageMenu();
                case "0" -> System.out.println("Good bye");
                default -> System.out.println("Wrong input, pick again");
            }
        } while (!choice.equals("0"));
    }

    public static void showPLMenu() {
        do {
            System.out.println("[1] Create Parcel Locker");
            System.out.println("[2] Show all Parcel Lockers");
            System.out.println("[3] Show Parcel Lockers by city");
            System.out.println("[4] Update Parcel Locker's name");
            System.out.println("[5] Update Parcel Locker's address");
            System.out.println("[6] Delete Parcel Locker");
            System.out.println("[7] BACK");
            System.out.println("[0] EXIT");

            choice = sc.next();
            switch (choice) {
                case "1":
                    addLocker();
                    break;
                case "2":
                    showAllLockers();
                    break;
                case "3":
                    showLockersByCity();
                    break;
                case "4":
                    updateLockerName();
                    break;
                case "5":
                    updateLockerAddress();
                    break;
                case "6":
                    removeLocker();
                    break;
                case "7":
                    showMenu();
                    break;
                case "0":
                    System.out.println("Good bye");
                    break;
                default:
                    System.out.println("Wrong input, pick again");
                    break;
            }
        } while (!choice.equals("0"));
    }

    public static void showPackageMenu() {
        do {
            System.out.println("[1] Create Package");
            System.out.println("[2] Read all Packages");
            System.out.println("[3] Update Package");
            System.out.println("[4] Delete Package");
            System.out.println("[5] BACK");
            System.out.println("[0] EXIT");

            choice = sc.next();
            switch (choice) {
                case "1" -> packageManager.createPackage();
                case "2" -> packageManager.readPackages();
                case "3" -> packageManager.updatePackageName();
                case "4" -> packageManager.deletePackage();
                case "5" -> showMenu();
                case "0" -> System.out.println("Good bye");
                default -> System.out.println("Wrong input, pick again");
            }
        } while (!choice.equals("0"));
    }

    public static void addLocker() {
        System.out.println("Provide name: ");
        String name = sc.next();
        System.out.println("Now address, provide street:");
        String street = sc.next();
        System.out.println("Provide city: ");
        String city = sc.next();
        System.out.println("Provide postalCode: ");
        String postalCode = sc.next();

        ParcelLockerManager.addLocker(name, new Address(street, city, postalCode));
        System.out.println("Parcel Locker created");
    }

    public static void showAllLockers() {
        ParcelLockerManager.showLockers();
    }

    public static void removeLocker() {
        System.out.println("Provide id: ");
        String id = sc.next();

        ParcelLockerManager.removeLocker(id);
        System.out.println("Locker removed");
    }

    public static void showLockersByCity() {
        System.out.println("Provide city: ");
        String city = sc.next();
        ParcelLockerManager.showLockersByCity(city);
    }

    public static void updateLockerName() {
        System.out.println("Provide id: ");
        String id = sc.next();
        System.out.println("Provide new name: ");
        String name = sc.next();

        ParcelLockerManager.updateLockerName(id, name);
        System.out.println("Locker updated");
    }

    public static void updateLockerAddress() {
        System.out.println("Provide id: ");
        String id = sc.next();
        System.out.println("Provide new street: ");
        String street = sc.next();
        System.out.println("Provide new city: ");
        String city = sc.next();
        System.out.println("Provide new postalCode: ");
        String postal = sc.next();

        ParcelLockerManager.updateLockerAddress(id, new Address(street, city, postal));
        System.out.println("Locker updated");
    }


}
