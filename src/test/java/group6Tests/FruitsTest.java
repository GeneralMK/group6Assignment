package group6Tests;

import masixolekondile.Fruits;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FruitsTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testFruitOutput() {
        Fruits.main(new String[]{});

        String expectedOutput =
                "Apple"  + System.lineSeparator() +
                        "Banana" + System.lineSeparator() +
                        "Orange" + System.lineSeparator() +
                        "Mango"  + System.lineSeparator() +
                        "Grapes" + System.lineSeparator();

        String failureMessage = "The output does not match the expected list of fruits.\n" +
                "Please ensure that your program prints each fruit on its own line " +
                "and in the correct order.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
