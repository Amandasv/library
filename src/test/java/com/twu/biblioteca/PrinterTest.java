package com.twu.biblioteca;

import org.junit.*;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

public class PrinterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(System.out);
    }

    @Test
    public void printsMessagePassed(){
        Printer printer = new Printer();
        String words = "Printer Test";

        printer.print(words);

        assertEquals("Printer Test", outContent.toString());
    }

    @Test
    public void printsAListOffStrings(){
        Printer printer = new Printer();

        Option option = new Option("Teste1", 1);
        Option option2 = new Option("Teste2", 2);

        List parameters = Arrays.asList(option, option2);
        printer.print(parameters);

        String expectedOutput = "[1] • Teste1\n[2] • Teste2\n";

        assertEquals(expectedOutput, outContent.toString());

    }
}
