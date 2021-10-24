package com.pb.glushnyak.hw3;
import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static int y;

    public static void main(String[] args) {
        y = rand();
        System.out.println("Угадайте задуманное число");
        System.out.println("Для выхода из программы введите любое отрицательное число");
        result();
    }
    public static int rand(){
        Random rand = new Random();
        int y = rand.nextInt(101);
        return y;
    }
    public static int zag(){
        Scanner up = new Scanner(System.in);
        return up.nextInt();
    }
    public static void result(){
        int count  = 0;
        boolean x = true;
        while (x){
            count++;
            System.out.println("Попытка " + count);
           int m = zag();

           if(m < 0){
               System.out.println("Вы сами завершили програму");
           }
           else if(m == y){
               System.out.println("Отгадано с " + count +" попыток" );
               x = false;
           } else if(m > y){
               System.out.println("Загаданное число больше вводимого");
           } else{
               System.out.println("Загаданное число меньше вводимого");
           }
        }
    }
}

