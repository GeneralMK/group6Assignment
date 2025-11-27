package masixolekondile;

public class Scores {
    public static int countScoresAbove80(int[] scores) {
        int count = 0;

        for (int score : scores) {
            if (score > 80) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Array with 6 student scores
        int[] scores = {75, 82, 90, 68, 88, 79};

        int count = countScoresAbove80(scores);

        System.out.println("Number of scores above 80: " + count);
    }
}
