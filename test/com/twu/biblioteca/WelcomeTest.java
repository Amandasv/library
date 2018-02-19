package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

public class WelcomeTest {

    private final Welcome welcome = new Welcome();

    @Test
    public void returnsWelcomeMessage(){
        String message = "Welcome";

        Assert.assertEquals(message, welcome.message("Welcome"));


    }

}
