package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookServiceTest {


    @Test
    public void initializesBookServicesWithAListOfBooks() {
        Book book = new Book("Harry Potter");

        List bookList = Arrays.asList(book);

        BookService bookService = new BookService(bookList);

        Assert.assertEquals(bookService.listAll(),bookList);

    }
}
