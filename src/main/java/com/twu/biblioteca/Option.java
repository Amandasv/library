package com.twu.biblioteca;

public class Option {

    private final String title;
    private final int code;


    public String getTitle() {
        return title;
    }

    public Option(String title, int code) {
        this.title = title;
        this.code = code;
    }

    @Override
    public String toString() {
        return "[" + code + "] • " + title;
    }
}
