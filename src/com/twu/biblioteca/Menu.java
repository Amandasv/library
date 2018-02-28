package com.twu.biblioteca;

import java.util.Arrays;
import java.util.List;

public class Menu {

    private List<Option> optionList;
    private Printer printer = new Printer();
    private BookService bookService = new BookService();

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

                break;

        }
    }

    private static List<Option> createMenuList(){
        Option listBooks = new Option("List Book", 0);
        Option option2 = new Option("Add Book", 1);
        Option exit = new Option("Exit", 9);
        List<Option> menuItens = Arrays.asList(listBooks, option2, exit);
        return menuItens;
    }


}
