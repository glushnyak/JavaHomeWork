package com.pb.glushnyak.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        Auth auth  = new Auth();
        Scanner yyy = new Scanner(System.in);
        try {
        System.out.println("Для регистрации на сайте");
        System.out.println("придумайте логин");
        String login = yyy.nextLine();
        System.out.println("придумайте пароль");
        String password = yyy.nextLine();
        System.out.println("подтвердите пароль");
        String confirmPassword = yyy.nextLine();

        auth.signUp(login, password, confirmPassword);

            System.out.println("Для входа на сайт");
            System.out.println("введите логин");
            String login_1 = yyy.nextLine();
            System.out.println("введите пароль");
            String password_1 = yyy.nextLine();

            auth.signIn(login_1, password_1);
        } catch (WrongLoginException | WrongPasswordException e){
            e.printStackTrace();
        }
    }
}
