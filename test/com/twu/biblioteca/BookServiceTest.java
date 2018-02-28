package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookServiceTest {


    @Test
    public void initializesBookServicesWithAListOfBooks() {
        Book book = new Book("Harry Potter", "J. K. Rowling","June 26, 1997");

        List bookList = Arrays.asList(book);

        BookService bookService = new BookService();

        Assert.assertEquals(bookService.listAll(),bookList);

    }
}
