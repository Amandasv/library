package com.twu.biblioteca;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BookService {

    private List<Book> bookList;
    private Printer printer = new Printer();

    public BookService() {
        this.bookList = initializeBookList();
    }

    public List<Book> listAll() {
        return this.bookList;
    }

    //arraylist
    private static List<Book> initializeBookList(){
        Book book1 = new Book("Harry Potter", "J. K. Rowling", "1997", false);
        Book book2 = new Book("Head First Java", "Kathy Sierra, Bert Bates", "2003", true);
        Book book3 = new Book("Happy: Simple Steps for Getting the Life You Want", "Ian K. Smith M.D.", "2010", true);
        Book book4 = new Book("The World I Dream Of", "Curt Butz", "2010", true);
        List<Book> bookList = Arrays.asList(book1, book2, book3, book4);
        return bookList;
    }

    public List<Book> availableList() {
        return this.bookList.stream().filter(book -> book.isChecked()).collect(Collectors.toList());
    }

    public List<Book> unavailableList() {
        return this.bookList.stream().filter(book -> !book.isChecked()).collect(Collectors.toList());
    }

    public boolean checkout(int index) {
        if (index <= availableList().size()-1) {
            Book selectedBook = availableList().get(index);
            if (availableList().contains(selectedBook)) {
                selectedBook.setChecked(false);
                return true;
            }
        }
        return false;
    }

    public boolean returnBook(int index) {
        if (index <= unavailableList().size()-1) {
            Book selectedBook = unavailableList().get(index);
            if (unavailableList().contains(selectedBook)) {
                selectedBook.setChecked(true);
                return true;
            }
        }
        return false;
    }


}
