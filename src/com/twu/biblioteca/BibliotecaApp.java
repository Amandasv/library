package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {

        Printer printer = new Printer();
        Scanner reader = new Scanner(System.in);
        Menu menu = new Menu();
        int option = 0;

        printer.print("Hello, Welcome to Bangalore Public Library! \n");

        while (option != 9) {
            printer.print("\n----------------------------\n");
            printer.print("-----------Menu-------------\n\n");

            menu.showOptions();
            printer.print("\n----------------------------\n");

            printer.print("Please, choose an option: ");

            if (reader.hasNextInt()) {
                option = reader.nextInt();
            } else {
                printer.println("Ops, write a valid number!");
                break;
            }

            menu.chooseOption(option);

            if (option == 9) {
                printer.print("\nByebye :) \n");
            }
        }

    }
}
