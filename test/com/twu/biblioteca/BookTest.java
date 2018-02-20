package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

public class BookTest {

    private final Book book = new Book();

    @Test
    public void returnsNameOfFirstBook() {
        book.setName("Head First");
        String name = book.getName();

        Assert.assertEquals(name, "Head First");


    }
}
