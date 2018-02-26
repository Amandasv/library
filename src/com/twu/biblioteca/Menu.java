package com.twu.biblioteca;

import java.util.Arrays;
import java.util.List;

public class Menu {

    private List<Option> optionList;
    Printer printer = new Printer();
    BookService bookService = new BookService(createBookList());

    public Menu(List<Option> optionList) {
        this.optionList = optionList;
    }

    public List<Option> showOptions() {
        return this.optionList;
    }

    public void chooseOption(int option) {
        switch (option) {
            case 1 :
                printer.print("Here is the list of all books available \n\n");
                printer.print(bookService.listAll());
                break;
            case 2 :
                printer.print("Opcao 2");
                break;

        }
    }

    private static List<Book> createBookList(){
        Book book1 = new Book("Harry Potter", "J. K. Rowling", "June 26, 1997");
        Book book2 = new Book("Head First Java", "Kathy Sierra, Bert Bates", "2003");
        List<Book> bookList = Arrays.asList(book1, book2);
        return bookList;
    }


}
