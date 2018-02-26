package com.twu.biblioteca;

public class Book {

    String name;
    String author;
    String yearPublished;

    public String getName() {
        return name;
    }
    public String getAuthor() { return author; }
    public String getYearPublished() { return yearPublished; }

    public Book(String name, String author, String yearPublished) {
        this.name = name;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return name + ", " + author + " - " + yearPublished + ";";
    }
}
