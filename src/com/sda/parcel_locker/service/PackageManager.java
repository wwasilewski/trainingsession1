package com.sda.parcel_locker.service;

import com.sda.parcel_locker.model.Package;
import com.sda.parcel_locker.model.Size;
import com.sda.parcel_locker.model.State;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PackageManager {

    private Scanner sc = new Scanner(System.in);
    private List<Package> packages;

    public PackageManager() {
        this.packages = new ArrayList<>();
        packages.add(new Package(1, "PACK1", Size.S, 1, "Tom", "Jack", "SC1", "WA2", State.SENT));
        packages.add(new Package(2, "PACK2", Size.M, 4, "Jerry", "Ann", "WA2", "KR3", State.PRE));
        packages.add(new Package(3, "PACK3", Size.L, 7, "Bob", "Marie", "KR3", "WR4", State.DELIV));
        packages.add(new Package(4, "PACK4", Size.XL, 12, "Ryan", "Al", "WR4", "SC1", State.PRE));
        packages.add(new Package(5, "PACK5", Size.S, 1, "Jack", "Barry", "GD5", "SC1", State.SENT));
    }

    public void createPackage() {
        System.out.println("Provide id: ");
        int id = sc.nextInt();
        System.out.println("Provide name: ");
        String name = sc.next();
        System.out.println("Provide size: ");
        Size size = Size.valueOf(sc.next());
        System.out.println("Provide weight: ");
        int weight = sc.nextInt();
        System.out.println("Provide recipient: ");
        String recipient = sc.next();
        System.out.println("Provide sender: ");
        String sender = sc.next();
        System.out.println("Provide sender's PL: ");
        String senderPL = sc.next();
        System.out.println("Provide recipient's PL:");
        String recipientPL = sc.next();
        System.out.println("Provide state: ");
        State state = State.valueOf(sc.nextLine());
        packages.add(new Package(id, name, size, weight, recipient, sender, senderPL, recipientPL, state));
        System.out.println("Package created");
    }

    public void readPackages() {
        System.out.println("All Packages: ");
        System.out.println(packages);
        System.out.println("What to do now?");
    }

    public void updatePackageName() {
        System.out.println("Updating Package: ");
        System.out.println("Provide id:");
        int id = sc.nextInt();
        System.out.println("Provide name: ");
        String name = sc.next();
        packages.get(id - 1).setName(name);
        System.out.println("Package updated");
    }

    public void deletePackage() {
        System.out.println("Provide id: ");
        int id = sc.nextInt();
        packages.set(id, null);
        System.out.println("Package deleted");
    }
}
