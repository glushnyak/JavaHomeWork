package com.pb.glushnyak.hw7;

public class Tie extends Clothes implements ManClothes{
    public final String name = "галстук";

    public Tie(Size size, double coast, String color) {
        super(size, coast, color);
    }

    @Override
    public void dressMan() {
        System.out.println(name + ", " + size.getDescription(size) + " ("
                +  size.getEuroSize(size) + "), цена " + coast + ", цвет " + color);
    }
}
