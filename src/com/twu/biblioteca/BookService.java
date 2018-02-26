package com.twu.biblioteca;

import java.util.List;

public class BookService {

    private List<Book> bookList;

    public BookService(List bookList) {
        this.bookList = bookList;
    }

    public void newBook(String name){
        Book book = new Book(name);
    }

    public void getName(){

    }

    public List<Book> listAll() {
        return this.bookList;
    }
}
