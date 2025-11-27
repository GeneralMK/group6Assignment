package group6Tests;
import masixolekondile.Scores;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoresTest {
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
    void testScoresAbove80Output() {

        Scores.main(new String[]{});

        String expectedOutput =
                "Number of scores above 80: 3" + System.lineSeparator();

        String failureMessage = "The output does not match the expected result.\n" +
                "Please ensure that your program correctly counts and prints " +
                "how many scores are above 80.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
