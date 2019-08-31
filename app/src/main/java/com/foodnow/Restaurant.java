package com.foodnow;

import java.util.ArrayList;

public class Restaurant {

    String name;
    int logo;
    int cover;
    String address;
    String openHours;
    ArrayList<Food> menu;
    String ID;

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getLogo() {
        return logo;
    }

    public int getCover() {
        return cover;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<Food> getMenu() {
        return menu;
    }

    public Restaurant(String name, int logo, int cover, String address, String openHours) {
        this.name = name;
        this.logo = logo;
        this.cover = cover;
        this.address = address;
        this.openHours = openHours;
    }

    public Restaurant()
    {}

    public void setMenu(ArrayList<Food> menu) {
        this.menu = menu;
    }

    public String getOpenHours() {
        return openHours;
    }
}
