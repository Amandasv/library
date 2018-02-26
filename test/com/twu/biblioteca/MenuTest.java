package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MenuTest {
    @Test
    public void initializesMenuList(){
        Option option = new Option("List Books", 1);

        List menuList = Arrays.asList(option);
        Menu menu = new Menu(menuList);

        Assert.assertEquals(menu.showOptions(), menuList);


    }
}
