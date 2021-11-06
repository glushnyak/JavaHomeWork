package com.pb.glushnyak.hw6;

public class Animal {
   private String food;
   private String location;
   private String name;
    public Animal(String food, String location, String name){
        this.food = food;
        this.location = location;
        this.name = name;
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void makeNoise(){
        System.out.println(name + "издает звук");
    }

    public void eat(){
        System.out.println(name + "питается");
    }

    public void sleep(){
        System.out.println(name + "спит");
    }
}

