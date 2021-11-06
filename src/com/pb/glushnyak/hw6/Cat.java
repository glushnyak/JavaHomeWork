package com.pb.glushnyak.hw6;

import java.util.Objects;

public class Cat extends Animal{
    public String predator;
    public String claws;
    public Cat (){
        super("Сметана", "квартире", "Барсик");
    }
    @Override
    public void makeNoise(){
        System.out.println("Мяукает");
        super.makeNoise();
    }
    @Override
    public void eat(){
        System.out.println("Рыбу");
        super.eat();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(predator, cat.predator) && Objects.equals(claws, cat.claws);
    }

    @Override
    public int hashCode() {
        return Objects.hash(predator, claws);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "predator='" + predator + '\'' +
                ", claws='" + claws + '\'' +
                '}';
    }
}
