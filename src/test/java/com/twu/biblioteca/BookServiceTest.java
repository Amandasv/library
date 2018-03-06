package com.twu.biblioteca;

import org.junit.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class BookServiceTest {

    private BookService bookService;

    @Before
    public void setup() {
         bookService = new BookService();
    }

    @Test
    public void initializesBookServicesWithAListOfBooks() {
        int numbersTotalList = 4;

        assertEquals(numbersTotalList,bookService.listAll().size());
    }

    @Test
    public void returnsOnlyAvailableList(){
        Book book2 = new Book("Head First Java", "Kathy Sierra, Bert Bates", "2003", true);
        Book book3 = new Book("Happy: Simple Steps for Getting the Life You Want", "Ian K. Smith M.D.", "2010", true);
        Book book4 = new Book("The World I Dream Of", "Curt Butz", "2010", true);

        List<Book> availableList = Arrays.asList(book2,book3,book4);

        assertEquals(bookService.availableList(), availableList);
    }

    @Test
    public void returnsUnavailableList(){
        Book harryPotter = new Book("Harry Potter", "J. K. Rowling", "1997", false);

        List<Book> unavailableList = Arrays.asList(harryPotter);

        assertEquals(bookService.unavailableList(), unavailableList);
    }

    @Test
    public void checkOutIfBookIsAvailable(){
        int selectedBookIndex = 1;
        Book selectedBook = bookService.availableList().get(selectedBookIndex);

        bookService.checkout(selectedBookIndex);

        assertFalse(bookService.availableList().contains(selectedBook));
    }

    @Test
    public void changeAvailabilityBookAfterCheckout() {
        int selectedBookIndex = 1;
        Book selectedBook = bookService.availableList().get(selectedBookIndex);

        bookService.checkout(selectedBookIndex);

        assertTrue(bookService.unavailableList().contains(selectedBook));
    }

    @Test
    public void doesNotCheckoutIfThisIndexDoesntExist(){
        int notExistIndex = 5;

        assertFalse(bookService.checkout(notExistIndex));
    }

    @Test
    public void returnsTrueIfThisBookCanBeReturned(){
        int selectedBookIndex = 0;

        Book selectedBook = bookService.unavailableList().get(selectedBookIndex);
        bookService.returnBook(selectedBookIndex);

        assertFalse(bookService.unavailableList().contains(selectedBook));
    }

 }
