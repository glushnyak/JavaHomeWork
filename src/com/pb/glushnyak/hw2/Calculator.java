package com.pb.glushnyak.hw2;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sw = new Scanner(System.in);
        int operand1;
        int operand2;
        String sing;

        System.out.println("Введите целое число1: ");
        operand1 = sw.nextInt();
        System.out.println("Введите целое число2: ");
        operand2 = sw.nextInt();
        System.out.println("Введите знак арифметической операции: ");
        sing = sw.next();

        switch (sing) {
            case "+":
                System.out.println("Результат сложения:" + (operand1 + operand2));
                break;
            case "-":
                System.out.println("Результат вычитания:" + (operand1 - operand2));
                break;
            case "*":
                System.out.println("Результат умножения:" + (operand1 * operand2));
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("Ошибка, деление на 0!");
                break; }
                System.out.println("Результат деления:" + (operand1 / operand2));
                break;


        }




    }

}
