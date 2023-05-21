package com.springboot.simpleproject;

public class Cat extends Animal {

    public Cat() {
        this.lifeExpectation = "12 – 18 anos";
        this.pregnantPeriod = "65 dias";
    }

    @Override
    String makeSound() {
        return "Miau Miau!";
    }
}
