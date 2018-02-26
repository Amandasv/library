package com.twu.biblioteca;

import java.util.List;

public class Printer {

    public void print(String words) {
        System.out.print(words);
    }

    public void print(List list) {

        for (Object object : list) {
            System.out.println(object.toString());
        }

    }
}
