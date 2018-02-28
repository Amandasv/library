package com.twu.biblioteca;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BookService {

    private List<Book> bookList;

    public BookService() {
        this.bookList = createBookList();
    }

    public List<Book> listAll() {
        return this.bookList;
    }

    private static List<Book> createBookList(){
        Book book1 = new Book("Harry Potter", "J. K. Rowling", "June 26, 1997");
        Book book2 = new Book("Head First Java", "Kathy Sierra, Bert Bates", "2003");
        List<Book> bookList = Arrays.asList(book1, book2);
        return bookList;
    }

    public List<Book> availableList() {
        return this.bookList.stream().filter(book -> !book.isChecked).collect(Collectors.toList());
    }

}
