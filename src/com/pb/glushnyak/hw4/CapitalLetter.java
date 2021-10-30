package com.pb.glushnyak.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        String y = razb();
        System.out.println(upy(y));

    }

    public static String razb(){
        System.out.println("Ведите предложение");
        Scanner up = new Scanner(System.in);
        String s = up.nextLine();
        return s;
    }

    public static String upy (String s){
        String sentence = new String();
        String [] arr = s.split(" ");
        StringBuilder st = new StringBuilder();
        String hh = "";

        for (int y = 0; y < arr.length; y++){
            st = st.append(arr [y].substring(0,1).toUpperCase() +  arr [y].substring(1).toLowerCase()).append(" ");
        }
        return st.toString();
    }

}

//1) ввести предложение
//2) Разбить предложения по пробелам
//3) засунуть в массив
//4) первый элемент каждого массива сделать болшой буквой
//5) склеить все, сделать из массива строку


