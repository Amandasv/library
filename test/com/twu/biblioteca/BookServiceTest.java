package com.twu.biblioteca;

import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertNotEquals;

public class BookServiceTest {

    private BookService bookService;

    @Before
    public void setup() {
         bookService = new BookService();
    }

    @Test
    public void initializesBookServicesWithAListOfBooks() {
        int numbersTotalList = 4;

        Assert.assertEquals(numbersTotalList,bookService.listAll().size());
    }

    @Test
    public void returnsOnlyAvailableList(){
        Book book2 = new Book("Head First Java", "Kathy Sierra, Bert Bates", "2003", true);
        Book book3 = new Book("Happy: Simple Steps for Getting the Life You Want", "Ian K. Smith M.D.", "2010", true);
        Book book4 = new Book("The World I Dream Of", "Curt Butz", "2010", true);

        List<Book> availableList = Arrays.asList(book2,book3,book4);

        Assert.assertEquals(bookService.availableList(), availableList);
    }

    @Test
    public void returnsUnavailableList(){
        Book harryPotter = new Book("Harry Potter", "J. K. Rowling", "1997", false);

        List<Book> unavailableList = Arrays.asList(harryPotter);

        Assert.assertEquals(bookService.unavailableList(), unavailableList);
    }

    @Test
    public void returnsFalseIfThatListIsDifferent() {
        assertNotEquals(bookService.listAll(), bookService.availableList());
    }


 }
