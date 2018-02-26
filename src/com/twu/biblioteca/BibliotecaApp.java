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
        Book book1 = new Book("Harry Potter", "J. K. Rowling", "June 26, 1997");
        Book book2 = new Book("Head First Java", "Kathy Sierra, Bert Bates", "2003");
        List<Book> bookList = Arrays.asList(book1, book2);
        return bookList;
    }
}
