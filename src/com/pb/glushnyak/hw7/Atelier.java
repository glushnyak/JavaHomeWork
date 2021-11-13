package com.pb.glushnyak.hw7;

public class Atelier {
    public static void main(String[] args) {
        Pants  pants = new Pants(Size.S, 4467.78, "черный");
        Skirt skirt = new Skirt(Size.XXS, 887.87, "красный");
        Tshirt tshirt = new Tshirt(Size.L, 9876.76, "синий");
        Tie tie = new Tie(Size.M, 120, "зеленый");

        Clothes [] clothes = {pants, skirt, tshirt, tie};

        dressWomen(clothes);
        dressMan(clothes);
    }

   static void dressMan(Clothes[] clothes) {
       System.out.println("Мужская одежда");
     for (Clothes c: clothes) {
         if (c instanceof ManClothes) {
            ((ManClothes) c).dressMan();
         }
     }
       System.out.println();
   }

    static void dressWomen(Clothes[] clothes){
        System.out.println("Женская одежда");
        for (Clothes c: clothes) {
            if (c instanceof WomenClothes) {
                ((WomenClothes) c).dressWomen();
            }
        }
        System.out.println();
    }
}
