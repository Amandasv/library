package com.twu.biblioteca;

import playground.BookServiceInterface;
import playground.BookServiceOracle;
import playground.Shelf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {

        Welcome welcome = new Welcome();
        Printer printer = new Printer();

        printer.print(welcome.message("Hello, Welcome to Bangalore Public Library"));

        BookServiceInterface bookService = new BookServiceOracle();

        List<String> strings = new ArrayList<>();

        Shelf shelf = new Shelf(bookService);
        shelf.showBooks(Arrays.asList("amanda", "harry", "void"));

    }
}
