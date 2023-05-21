package com.springboot.simpleproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SimpleProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleProjectApplication.class, args);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione qual animal você gostaria de saber mais informações:");
        System.out.println("1. Cachorro");
        System.out.println("2. Gato");
        int option = scanner.nextInt();
        try {
            chooseAnimal(option);
            scanner.close();
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getLocalizedMessage());
        }
    }

    private static void chooseAnimal(int option) {
        switch (option) {
            case 1 -> dogCuriosity();
            case 2 -> catCuriosity();
            default ->
                    throw new IllegalArgumentException("Código errado inserido, por favor insira um dos códigos descritos acima");
        }
    }

    private static void dogCuriosity() {
        Dog dog = new Dog();
        System.out.println("O tempo médio de vida de um cachorro é: " + dog.lifeExpectation);
        System.out.println("O tempo médio de gestação de um cachorro é: " + dog.pregnantPeriod);
    }

    private static void catCuriosity() {
        Cat cat = new Cat();
        System.out.println("O tempo médio de vida de um gato é: " + cat.lifeExpectation);
        System.out.println("O tempo médio de gestação de um gato é: " + cat.pregnantPeriod);
    }


}
