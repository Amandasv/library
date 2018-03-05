package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MenuTest {

    private Menu menu;

    @Before
    public void setup() {
        menu = new Menu();
    }

    @Test
    public void initializeMenuWithAListOfOptions() {
        int numbersTotalList = 4;

        Assert.assertEquals(numbersTotalList, menu.listOptions().size());
    }

}
