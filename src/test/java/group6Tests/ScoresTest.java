package group6Tests;
import masixolekondile.Scores;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoresTest {
    @Test
    public void testCountScoresAbove80() {
        int[] scores = {75, 82, 90, 68, 88, 79};

        int result = Scores.countScoresAbove80(scores);

        // We expect 3 scores to be above 80
        assertEquals(3, result);
    }
}
