package com.twu.biblioteca;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private List<Option> optionList;
    private Printer printer = new Printer();
    private BookService bookService = new BookService();
    Scanner reader = new Scanner(System.in);

    public Menu() {
        this.optionList = createMenuList();
    }

    public void showOptions() {
        optionList.forEach(option -> printer.print(option.toString() + "\n") );
    }


    public void chooseOption(int option) {
        printer.print("[" + option + "] ");

        switch (option) {
            case 0 :
                printer.println(optionList.get(0).getTitle() + "\n");
                printer.print(bookService.listAll());
                break;
            case 1 :
                printer.println(optionList.get(1).getTitle() + "\n");
                bookService.showAvailableList();

                if (bookService.availableList().isEmpty()) {
                    printer.print("Sorry, but don't have available books");
                } else {
                    printer.print("Choose number of book: ");
                    int index = reader.nextInt();
                    bookService.checkout(index);
                }
                break;
            case 2 :
                printer.println(optionList.get(2).getTitle() + "\n");
                bookService.showUnavailabeleList();
                if (bookService.unavailableList().isEmpty()) {
                    printer.print("Sorry, but don't have book to return.");
                } else {
                    printer.print("Choose number of book: ");
                    int index = reader.nextInt();
                    bookService.returnBook(index);
                }
                break;
        }
    }

    private static List<Option> createMenuList(){
        Option listBooks = new Option("List Books", 0);
        Option checkout = new Option("Checkout Book", 1);
        Option returnBook = new Option("Return Book", 2);
        Option exit = new Option("Exit", 9);
        List<Option> menuItens = Arrays.asList(listBooks, checkout, returnBook, exit);
        return menuItens;
    }


}
