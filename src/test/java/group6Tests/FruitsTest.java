package group6Tests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class FruitsTest {
    @Test
    public void testFruitArrayContents() {
        String[] expected = {"Apple", "Banana", "Orange", "Mango", "Grapes"};
        String[] actual   = {"Apple", "Banana", "Orange", "Mango", "Grapes"};

        assertArrayEquals(expected, actual);
    }
}
