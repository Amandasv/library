package com.twu.biblioteca;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {

        Welcome welcome = new Welcome();
        Printer printer = new Printer();


        printer.print(welcome.message("Hello, Welcome to Bangalore Public Library! \n\n"));

        BookService bookService = new BookService(createBookList());

        printer.print("Here is the list of all books available \n\n");
        printer.print(bookService.listAll());




    }

    private static List<Book> createBookList(){
        Book book1 = new Book("Harry Potter");
        Book book2 = new Book("Head First");
        List<Book> bookList = Arrays.asList(book1, book2);
        return bookList;
    }
}
