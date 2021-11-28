package com.pb.glushnyak.hw10;

public class Main {
    public static void main(String[] args) {
        NumBox<Integer> masi = new NumBox<>(44);
        NumBox<Float> masf = new NumBox<>(14);
        try {
            masf.add(445F);
            masf.add(67.9F);
            masf.add(46745F);
            masf.add(6777.9F);
            masf.add(44775.345F);
            masf.add(6557.9F);
            masf.add(44445.79F);
            masf.add(6887.9F);

            masi.add(567);
            masi.add(123);
            masi.add(103);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Массив переполнен");
            e.printStackTrace();
        }

        System.out.println(masf.get(1));
        System.out.println(masi.get(1));

        System.out.println(masf.length());
        System.out.println(masi.length());

        System.out.println(masf.average());
        System.out.println(masi.average());

        System.out.println(masf.sum());
        System.out.println(masi.sum());

        System.out.println(masf.max());
        System.out.println(masi.max());

    }
}
