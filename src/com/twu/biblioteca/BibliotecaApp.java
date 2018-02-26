package com.twu.biblioteca;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {

        Welcome welcome = new Welcome();
        Printer printer = new Printer();
        Scanner reader = new Scanner(System.in);


        printer.print(welcome.message("Hello, Welcome to Bangalore Public Library! \n"));
        int option = 0;

        Menu menu = new Menu(createMenuList());


        while (option != 9) {
            printer.print("\n\n----------------------------\n");
            printer.print("-----------Menu-------------\n\n");

            printer.print(menu.showOptions());
            printer.print("\n----------------------------\n");

            printer.print("Please, choose an option: ");
            option = reader.nextInt();
            menu.chooseOption(option);

            if (option == 9) {
                printer.print("\nByebye :) \n");
            }
        }

    }


    private static List<Option> createMenuList(){
        Option listBooks = new Option("List Book", 1);
        Option option2 = new Option("Option 2", 2);
        Option exit = new Option("Exit", 9);
        List<Option> menuItens = Arrays.asList(listBooks, option2, exit);
        return menuItens;
    }
}
