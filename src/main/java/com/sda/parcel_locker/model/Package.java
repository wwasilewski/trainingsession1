package com.sda.parcel_locker.model;

import java.util.UUID;

public class Package {

    private String id = UUID.randomUUID().toString();
    private String name;
    private Size size;
    private int weight;
    private String recipient;
    private String sender;
    private ParcelLocker senderPL;
    private ParcelLocker recipientPL;
    private State state = State.PRE;

    public Package(String name, Size size, int weight, String recipient, String sender,
                   ParcelLocker senderPL, ParcelLocker recipientPL) {
        this.name = name;
        this.size = size;
        this.weight = weight;
        this.recipient = recipient;
        this.sender = sender;
        this.senderPL = senderPL;
        this.recipientPL = recipientPL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public ParcelLocker getSenderPL() {
        return senderPL;
    }

    public void setSenderPL(ParcelLocker senderPL) {
        this.senderPL = senderPL;
    }

    public ParcelLocker getRecipientPL() {
        return recipientPL;
    }

    public void setRecipientPL(ParcelLocker recipientPL) {
        this.recipientPL = recipientPL;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Package id: " + id + " ,name: " + name;
    }
}
