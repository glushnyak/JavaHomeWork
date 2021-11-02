package com.pb.glushnyak.hw5;

public class Library {
    public static void main(String[] args) {
        Book [] bookList ={new Book("Приключения", "Иванов И. И.", "2000 г."), new Book("Словарь", "Сидоров А. В ", "1980 г."), new Book("Энциклопедия", "Гусев К. В.", "2010 г.")};
        Reader [] userList = {new Reader ("Петров В.К.", 12345, "Экология", "12/01/2001", "+380973686369"), new Reader ("Сидорова В.К.", 1767823, "Экономика", "18/09/2006", "+380973688765"), new Reader ("Федоров И.В.", 34566, "Геодезия", "31/01/2002", "+380971234369")};


        StringBuilder nameLiST = new StringBuilder();
        for (int i = 0; i < bookList.length; i++){
            nameLiST.append(bookList[i].name_book).append(" (").append(bookList[i].autor_book).append(" ").append(bookList[i].year_book).append("), ");
        }
        System.out.println(nameLiST);

        StringBuilder nameUser = new StringBuilder();
        for (int i = 0; i < userList.length; i++){
            nameUser.append(userList[i].name_user).append(" (").append(userList[i].numb_user).append(" ,").append(userList[i].fakult_user).append(" ,").append(userList[i].Birth_user).append(" ,").append(userList[i].tel_user).append("), ");
        }
        System.out.println(nameUser);

        Reader.takeBook(3);

        String [] uu = {bookList[0].name_book, bookList[1].name_book, bookList[2].name_book};
        Reader.takeBook(uu);

        Reader.takeBook(bookList);

        Reader.returnBook(3);

        Reader.returnBook(uu);

        Reader.returnBook(bookList);
    }
}
