package com.pb.glushnyak.hw7;

public abstract class Clothes {
    Size size;
    double coast;
    String color;

    public Clothes(Size size, double coast, String color) {
        this.size = size;
        this.coast = coast;
        this.color = color;
    }
}
