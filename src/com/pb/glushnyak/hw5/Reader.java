package com.pb.glushnyak.hw5;

public class Reader {
    String name_user;//  - ФИО
    int numb_user;// - номер читательского билета
    String fakult_user;// - факультет
    String Birth_user;// - дата рождения
    String tel_user;// - телефон

    public Reader(String name_user, int numb_user, String fakult_user, String Birth_user, String tel_user){
        this.name_user = name_user;
        this.numb_user = numb_user;
        this.fakult_user = fakult_user;
        this.Birth_user = Birth_user;
        this.tel_user = tel_user;
    }

    public static void takeBook (int v) {
        System.out.println("Петров В. В. взял " + v + " книги");
    }

    public static void takeBook (String [] m) {
        StringBuilder nameBook = new StringBuilder();
        for (int i = 0; i < m.length; i++){
            nameBook.append(m[i]).append(", ");
        }
        System.out.println("Петров В. В. взял книги: " + nameBook );
    }

    public static void takeBook (Book [] nn) {
        StringBuilder nameLiST = new StringBuilder();
        for (int i = 0; i < nn.length; i++){
            nameLiST.append(nn[i].name_book).append(" (").append(nn[i].autor_book).append(" ").append(nn[i].year_book).append("), ");
        }
        System.out.println("Петров В. В. взял книги: " + nameLiST );
    }

    public static void returnBook (int v) {
        System.out.println("Петров В. В. вернул " + v + " книги");
    }

    public static void returnBook (String [] m) {
        StringBuilder nameBook = new StringBuilder();
        for (int i = 0; i < m.length; i++){
            nameBook.append(m[i]).append(", ");
        }
        System.out.println("Петров В. В. вернул книги: " + nameBook );
    }

    public static void returnBook (Book [] nn) {
        StringBuilder nameLiST = new StringBuilder();
        for (int i = 0; i < nn.length; i++){
            nameLiST.append(nn[i].name_book).append(" (").append(nn[i].autor_book).append(" ").append(nn[i].year_book).append("), ");
        }
        System.out.println("Петров В. В. вернул книги: " + nameLiST );
    }
}
