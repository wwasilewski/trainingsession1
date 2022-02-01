package com.sda.parcel_locker.userinterface;

import com.sda.parcel_locker.service.PackageManager;
import com.sda.parcel_locker.service.ParcelLockerManager;

import java.util.Scanner;

public class UserInterface {

    private static Scanner sc = new Scanner(System.in);
    private static ParcelLockerManager parcelLockerManager = new ParcelLockerManager();
    private static PackageManager packageManager = new PackageManager();

    public static void showMenu() {
        System.out.println("[1] Show Parcel Locker Menu");
        System.out.println("[2] Show Package Menu");
        System.out.println("[3] EXIT");

        String userChoice = sc.nextLine();
        switch (userChoice) {
            case "1":
                showPLMenu();
                break;
            case "2":
                showPackageMenu();
                break;
            case "3":
                System.out.println("Good bye");
                break;
            default:
                System.out.println("Wrong input, pick again");
                showMenu();
        }
    }

    public static void showPLMenu() {
        System.out.println("[1] Create Parcel Locker");
        System.out.println("[2] Read/Show all Parcel Lockers");
        System.out.println("[3] Update Parcel Locker");
        System.out.println("[4] Delete Parcel Locker");
        System.out.println("[5] BACK");
        System.out.println("[6] EXIT");

        String userChoice = sc.nextLine();
        switch (userChoice) {
            case "1":
                parcelLockerManager.createPL();
                showPLMenu();
                break;
            case "2":
                parcelLockerManager.readPL();
                showPLMenu();
                break;
            case "3":
                parcelLockerManager.updatePL();
                showPLMenu();
                break;
            case "4":
                parcelLockerManager.deletePL();
                showPLMenu();
                break;
            case "5":
                showMenu();
                break;
            case "6":
                System.out.println("Good bye");
                break;
            default:
                System.out.println("Wrong input, pick again");
                showPLMenu();
                break;
        }
    }

    public static void showPackageMenu() {
        System.out.println("[1] Create Package");
        System.out.println("[2] Read all Packages");
        System.out.println("[3] Update Package");
        System.out.println("[4] Delete Package");
        System.out.println("[5] BACK");
        System.out.println("[6] EXIT");

        String userChoice = sc.nextLine();
        switch (userChoice) {
            case "1":
                packageManager.createPackage();
                showPackageMenu();
                break;
            case "2":
                packageManager.readPackages();
                showPackageMenu();
                break;
            case "3":
                packageManager.updatePackageName();
                showPackageMenu();
                break;
            case "4":
                packageManager.deletePackage();
                showPackageMenu();
                break;
            case "5":
                showMenu();
                break;
            case "6":
                System.out.println("Good bye");
                break;
            default:
                System.out.println("Wrong input, pick again");
                showPackageMenu();
        }
    }
}
