package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {

        Welcome welcome = new Welcome();
        Printer printer = new Printer();

        printer.print(welcome.message("Hello, Welcome to Bangalore Public Library"));

    }
}
