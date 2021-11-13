package com.pb.glushnyak.hw7;

public class Skirt extends Clothes implements WomenClothes {
 public final String name = "юбка";

    public Skirt(Size size, double coast, String color) {
        super(size, coast, color);
    }

    @Override
    public void dressWomen() {
        System.out.println(name + ", " + size.getDescription(size) + " ("
                +  size.getEuroSize(size) + "), цена " + coast + ", цвет " + color);
    }
}
