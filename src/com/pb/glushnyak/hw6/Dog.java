package com.pb.glushnyak.hw6;

import java.util.Objects;

public class Dog extends Animal {
    public String security;
    public String devotion;
    public Dog (){
        super("Мясо", "вольере", "Тузик");

    }
    @Override
    public void makeNoise(){
        System.out.println("Гавкает");
        super.makeNoise();
    }
    @Override
    public void eat(){
        System.out.println("Кашу");
        super.eat();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(security, dog.security) && Objects.equals(devotion, dog.devotion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(security, devotion);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "security='" + security + '\'' +
                ", devotion='" + devotion + '\'' +
                '}';
    }
}
