package com.sda.parcel_locker.service;

import com.sda.parcel_locker.model.Package;
import com.sda.parcel_locker.model.Size;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PackageManager {

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private List<Package> packages;

    public PackageManager() {
        this.packages = new ArrayList<>();
        initData();
    }

    public void initData() {
        packages.add(new Package("PACK1", Size.S, 1, "Tom", "Jack", null, null));
        packages.add(new Package("PACK2", Size.M, 4, "Jerry", "Ann", null, null));
        packages.add(new Package("PACK3", Size.L, 7, "Bob", "Marie", null, null));
        packages.add(new Package("PACK4", Size.XL, 12, "Ryan", "Al", null, null));
        packages.add(new Package("PACK5", Size.S, 1, "Jack", "Barry", null, null));
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

        packages.set(id - 1, null);
        System.out.println("Package deleted");
    }

    @Override
    public String toString() {
        return "PackageManager{" +
                "packages=" + packages +
                '}';
    }
}
