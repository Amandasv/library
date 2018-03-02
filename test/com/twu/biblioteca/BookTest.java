package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

public class BookTest {
    @Test
    public void verifiesThatOtherBookIsEqual(){
        Book bookHeadFirst = new Book("Head First Java", "Kathy Sierra, Bert Bates", "2003", true);
        Book bookOtherHeadFirst = new Book("Head First Java", "Kathy Sierra, Bert Bates", "2003", true);

        Assert.assertEquals(bookHeadFirst, bookOtherHeadFirst);
    }

    @Test
    public void verifiesIfThatOtherBooksIsDifferent() {
        Book bookHeadFirst = new Book("Head First Java", "Kathy Sierra, Bert Bates", "2003", true);
        Book bookOtherHeadFirst = new Book("Head Java", "Kathy Sierra, Bert Bates", "2003", true);

        Assert.assertNotEquals(bookHeadFirst, bookOtherHeadFirst);
    }
}
