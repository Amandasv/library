package com.twu.biblioteca;

import java.util.List;

public class BookService {

    private List<Book> bookList;

    public BookService(List bookList) {
        this.bookList = bookList;
    }

    public List<Book> listAll() {
        return this.bookList;
    }
}
