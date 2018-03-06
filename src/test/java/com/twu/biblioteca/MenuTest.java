package com.twu.biblioteca;

import org.junit.*;
import org.mockito.ArgumentMatchers;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

public class MenuTest {

    private Menu menu;
    private BookService bookServiceMock;
    private Printer printerMock;

    @Before
    public void setup() {
        bookServiceMock = mock(BookService.class);
        printerMock = mock(Printer.class);
        menu = new Menu(bookServiceMock, printerMock);
    }

    @Test
    public void initializeMenuWithAListOfOptions() {
        int numbersTotalList = 4;

        Assert.assertEquals(numbersTotalList, menu.listOptions().size());
    }

    @Test
    public void callsBookServiceListAllWhenListingBooks() {
        Book book2 = new Book("Head First Java", "Kathy Sierra, Bert Bates", "2003", true);

        List<Book> availableList = Arrays.asList(book2);

        when(bookServiceMock.listAll()).thenReturn(availableList);

        menu.chooseOption(0);

        verify(bookServiceMock, times(1)).listAll();
        verify(printerMock).print(ArgumentMatchers.eq(availableList));
    }











}
