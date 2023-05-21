package com.springboot.simpleproject;

public abstract class Animal {

    private String Color;
    private int pawNumber;

    abstract String makeSound(String sound);

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getPawNumber() {
        return pawNumber;
    }

    public void setPawNumber(int pawNumber) {
        this.pawNumber = pawNumber;
    }
}
