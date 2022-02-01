package com.sda.parcel_locker.userinterface;

import com.sda.parcel_locker.service.PLManager;

import java.util.Scanner;

public class UserInterface {

    private static Scanner sc = new Scanner(System.in);
    private static PLManager manager = new PLManager();

    public static void showMenu() {
        System.out.println("[1] Show Parcel Locker Menu");
        System.out.println("[2] Show Package Menu");
        System.out.println("[3] EXIT");

        int userChoice = sc.nextInt();
        switch (userChoice) {
            case 1: {
                showPLMenu();
                break;
            }
            case 2: {
                showPackageMenu();
                break;
            }
            case 3: {
                System.out.println("Good bye");
                break;
            }
            default:
                showMenu();
        }
    }

    public static void showPLMenu() {
        System.out.println("[1] Create Parcel Locker");
        System.out.println("[2] Read all Parcel Lockers");
        System.out.println("[3] Update Parcel Locker");
        System.out.println("[4] Delete Parcel Locker");
        System.out.println("[5] EXIT");

        int userChoice = sc.nextInt();
        switch (userChoice) {
            case 1: {
                System.out.println("test");

            }

            case 2: {

            }

            case 3: {

            }

            case 4: {

            }

            case 5: {

            }

            default:
        }
    }

    public static void showPackageMenu() {
        System.out.println("[1] Create Package");
        System.out.println("[2] Read all Packages");
        System.out.println("[3] Update Package");
        System.out.println("[4] EXIT");

        int userChoice = sc.nextInt();
        switch (userChoice) {
            case 1:
            case 2:
            case 3:
            case 4:
            default:
        }
    }
}
