package com.sda.parcel_locker.userinterface;

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

            choice = sc.nextLine();
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
            System.out.println("[2] Read/Show all Parcel Lockers");
            System.out.println("[3] Update Parcel Locker");
            System.out.println("[4] Delete Parcel Locker");
            System.out.println("[5] BACK");
            System.out.println("[0] EXIT");

            choice = sc.nextLine();
            switch (choice) {
                case "1" -> parcelLockerManager.createPL();
                case "2" -> parcelLockerManager.readPL();
                case "3" -> parcelLockerManager.updatePL();
                case "4" -> parcelLockerManager.deletePL();
                case "5" -> showMenu();
                case "0" -> System.out.println("Good bye");
                default -> System.out.println("Wrong input, pick again");
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

            choice = sc.nextLine();
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
}
