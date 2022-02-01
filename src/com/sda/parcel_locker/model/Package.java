package com.sda.parcel_locker.model;

public class Package {

    private int id;
    private String name;
    private Size size;
    private int weight;
    private String recipient;
    private String sender;
    private ParcelLocker senderPL;
    private ParcelLocker recipientPL;
    private State state;

    public Package(int id, String name, Size size, int weight, String recipient, String sender,
                   ParcelLocker senderPL, ParcelLocker recipientPL, State state) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.weight = weight;
        this.recipient = recipient;
        this.sender = sender;
        this.senderPL = senderPL;
        this.recipientPL = recipientPL;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Package{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", weight=" + weight +
                ", recipient='" + recipient + '\'' +
                ", sender='" + sender + '\'' +
                ", senderPL=" + senderPL +
                ", recipientPL=" + recipientPL +
                ", state=" + state +
                '}';
    }
}
