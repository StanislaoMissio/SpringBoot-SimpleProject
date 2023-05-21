package com.springboot.simpleproject;

public class Dog extends Animal {

    public Dog(){
        this.pregnantPeriod = "63 dias (podendo variar de 58 a 68 dias)";
        this.lifeExpectation = "10 a 13 anos";
    }

    @Override
    public String makeSound() {
        return "Au Au!";
    }
}
