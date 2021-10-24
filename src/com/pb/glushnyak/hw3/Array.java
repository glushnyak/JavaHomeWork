package com.pb.glushnyak.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int [] arr = new int[10];
        int count = 0;
        Scanner in = new Scanner(System.in);

        for(int y = 0; y < 10; y++) {
            System.out.println("Введите элемент " + (y+1));
            arr[y] = in.nextInt();
        }
        System.out.println("Введеннный массив:" + Arrays.toString(arr));
        System.out.println("Сумма всех элементов " + Arrays.stream(arr).sum());

        for(int i = 0; i < arr.length; i++ ){
            if(arr[i] > 0) {
              count++;
            }
        }
        System.out.println("Количество положительных элементов " + count);

        boolean sorted = false;
        int buf;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    sorted = false;
                    buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;
                }
            }
        }
        System.out.println("Введеннный отсортированный массив:" + Arrays.toString(arr));
    }
}
