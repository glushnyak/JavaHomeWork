package com.pb.glushnyak.hw5;

import java.security.PublicKey;

public class Book {
    String name_book;// название
    String autor_book;// автор книги
    String year_book;//год издания

    public Book(String name_book, String autor_book, String year_book){
        this.name_book = name_book;
        this.autor_book = autor_book;
        this.year_book = year_book;
    }
}
