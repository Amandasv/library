package com.twu.biblioteca;

import java.util.List;

public class Menu {

    private List<Option> optionList;

    public Menu(List<Option> optionList) {
        this.optionList = optionList;
    }

    public List<Option> showOptions() {
        return this.optionList;
    }
}
