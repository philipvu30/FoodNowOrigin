package com.foodnow;

public class Food {
    private String name;
    private int image;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Food(String name, int image, int price) {
        this.name = name;
        this.image = image;
        this.price = price;
    }
    public  Food(){}
}
