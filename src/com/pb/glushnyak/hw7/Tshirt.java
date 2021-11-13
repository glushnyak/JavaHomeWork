package com.pb.glushnyak.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes {
    public final String name = "футболка";

    public Tshirt(Size size, double coast, String color) {
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
