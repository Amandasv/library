package com.twu.biblioteca;

public class Book {

    public Book(String name) {
        this.name = name;
    }

    String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Title: " + name;
    }
}
