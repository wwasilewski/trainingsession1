package com.sda.parcel_locker.model;

public class Package {

    private int id;
    private String name;
    private Size size;
    private int weight;
    private String recipient;
    private String sender;
    private String senderPL;
    private String recipientPL;
    private State state;

    public Package(int id, String name, Size size, int weight, String recipient, String sender,
                   String senderPL, String recipientPL, State state) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getSenderPL() {
        return senderPL;
    }

    public void setSenderPL(String senderPL) {
        this.senderPL = senderPL;
    }

    public String getRecipientPL() {
        return recipientPL;
    }

    public void setRecipientPL(String recipientPL) {
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
