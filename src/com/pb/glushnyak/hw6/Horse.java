package com.pb.glushnyak.hw6;

import java.util.Objects;

public class Horse extends Animal {
    public String shipping;
    public String bridle;
    public Horse (){
        super("Сено", "конюшне", "Мустанг");
    }

    @Override
    public void makeNoise(){
        System.out.println("фыркает");
       super.makeNoise();
    }
    @Override
    public void eat(){
        System.out.println("Сахар");
        super.eat();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Objects.equals(shipping, horse.shipping) && Objects.equals(bridle, horse.bridle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shipping, bridle);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "shipping='" + shipping + '\'' +
                ", bridle='" + bridle + '\'' +
                '}';
    }
}
