package com.pb.glushnyak.hw12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception  {
        PhoneBook p = new PhoneBook();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Возможные функции справосника:");
            System.out.println("Добавить клиента, введите  \"добавить\" \n" +
                    "Удалить клиента, введите \"удалить\" \n" +
                    "Поиск по ФИО, введите \"поиск по ФИО\" \n" +
                    "Редактировать ФИО, введите \"редактировать\"\n" +
                    "Посмотреть с сортировкой по ФИО, введите \"сорт ФИО\" \n" +
                    "Посмотреть с сортировкой по по дате, введите \"сорт дата\" \n" +
                    "Записать в файл, введите \"запись\" \n" +
                    "Выгрузить из файла, введите \"выгрузить\" \n" +
                    "Завершешить программу, введите \"завершить\" ");
            boolean a = true;
            int count = 0;
            String answer = "Да";

            while (a){
                if(count > 0) {
                    System.out.println("Продолжаем работу со справочником? \"Да или Нет\"");
                    answer = sc.nextLine();
                }

                if (answer.equals("Да")) {
                    String rez = sc.nextLine();
                    switch (rez) {
                        case "добавить":
                            p.addClient();
                            break;
                        case "удалить":
                            System.out.println("Введите удаляемое ФИО: ");
                            p.deleteClient(sc.nextLine());
                            break;
                        case "поиск по ФИО":
                            System.out.println("Введите искомое ФИО: ");
                            p.serchClient(sc.nextLine());
                            break;
                        case "редактировать":
                            System.out.println("Введите редактируюмое ФИО: ");
                            p.editClient(sc.nextLine());
                            break;
                        case "сорт ФИО":
                            p.sortClient();
                            break;
                        case "сорт дата":
                            p.sortdateEdit();
                            break;
                        case "запись":
                            p.writtenData();
                            break;
                        case "выгрузить":
                            p.loadingData();
                            break;
                        case "завершить":
                            a = false;
                            break;
                        default:
                            System.out.println("Возможны только варианты выше");
                            a = false;
                            break;
                    }
                    count++;
                } else if(answer.equals("Нет")){
                    System.out.println("Спасибо");
                    a = false;
                } else {
                    System.out.println("Возможны только варианты \"Да или Нет\" ");
                    a = false;
                }
            }
        } catch (Exception e){
            System.out.println("Ошибка");
            e.printStackTrace();
        }
    }
}
