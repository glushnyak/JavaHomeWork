package com.pb.glushnyak.hw7;

public class Pants extends Clothes implements ManClothes, WomenClothes{
    public final String name = "штаны";

    public Pants(Size size, double coast, String color) {
        super(size, coast, color);
    }

    @Override
    public void dressMan() {
        System.out.println(name + ", " + size.getDescription(size) + " ("
                +  size.getEuroSize(size) + "), цена " + coast + ", цвет " + color);
    }

    @Override
    public void dressWomen() {
        System.out.println(name + ", " + size.getDescription(size) + " ("
                +  size.getEuroSize(size) + "), цена " + coast + ", цвет " + color);

    }
}
