package group6Tests;

import masixolekondile.SwapNumbers;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class SwapNumbersTest {

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
    void testMainOutput() {
        SwapNumbers.main(new String[]{});

        String expectedOutput =
                "Before swap: a = 10, b = 20" + System.lineSeparator() +
                        "After swap: a = 20, b = 10" + System.lineSeparator();

        String failureMessage =
                "The output does not match the expected before/after swap values.\n" +
                        "Please ensure that your program correctly swaps the two integers.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
