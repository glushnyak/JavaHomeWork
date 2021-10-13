package com.pb.glushnyak.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner sw = new Scanner(System.in);
        int ghg;
        System.out.println("Введите целое число: ");
        ghg = sw.nextInt();
        if (ghg >= 0 && ghg <= 14) {
            System.out.println("Число в интервале [0-14]");
        } else if (ghg >= 15 && ghg <= 35) {
            System.out.println("Число в интервале [15-35]");
        } else if (ghg >= 36 && ghg <= 50) {
            System.out.println("Число в интервале [36-50]");
        } else if (ghg >= 51 && ghg <= 100) {
            System.out.println("Число в интервале [51-100]");
        } else {
            System.out.println("Число не в необходимых промежутках");
        }
    }
}
