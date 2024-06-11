package org.example.lesson2;

import java.util.ArrayList;

public class Car {
    private String manufactuer;
    private String number;
    private int year;
    private String owner;
    private ArrayList<String> owners = new ArrayList<String>();

    public String getManufactuer() {
        return manufactuer;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getYear() {
        return year;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        owners.add(owner);
        this.owner = owner;
    }

    public Car(String manufactuer, String number, int year, String owner) {
        this.manufactuer = manufactuer;
        this.number = number;
        this.year = year;
        this.owner = owner;
        owners.add(owner);

    }

    public ArrayList<String> getOwners() {
        return owners;
    }

}


