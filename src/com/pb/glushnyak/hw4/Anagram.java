package com.pb.glushnyak.hw4;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {

    public static void main (String [] args ){
        String y = ggg().toLowerCase().replaceAll("[^a-z&&[^а-я]]","");
        String u = ggg().toLowerCase().replaceAll("[^a-z&&[^а-я]]","");
        System.out.println(jjj(y,u));
    }
    public static String ggg() {
        System.out.println("Ведите предложение:");
        Scanner up = new Scanner(System.in);
        String s = up.nextLine();
        return s;
    }
    public static String jjj(String y, String u) {
        char[] mas1 = y.toCharArray();
        char[] mas2 = u.toCharArray();
        Arrays.sort(mas1);
        Arrays.sort(mas2);
        String k = Arrays.toString(mas1);
        String n = Arrays.toString(mas2);

        if (k.equals(n)) {
            return "Ведена анаграма";
        } else {
            return"Ведена НЕ анаграма";
        }
        }
}

//1) ввести 2 строки пользователем
//2) Убрать пробелы и символы
//3) сделать из строк массив букв
//4) Сортировка по массива алфавиту
//5) Приведение массива к строке
//6) Сравнение строк
