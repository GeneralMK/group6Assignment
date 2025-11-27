package group6Tests;

import masixolekondile.SwapNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class SwapNumbersTest {

    @Test
    public void testSwap() {
        int a = 5;
        int b = 9;

        int[] swapped = SwapNumbers.swap(a, b);

        // After swapping, first should be 9, second should be 5
        assertEquals(9, swapped[0]);
        assertEquals(5, swapped[1]);
    }
}
