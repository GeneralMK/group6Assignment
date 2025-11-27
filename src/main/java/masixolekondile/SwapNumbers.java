package masixolekondile;

public class SwapNumbers {
    /*
    Method that swaps two numbers using a temp variable
    and returns them in an array: [newA, newB]
    * */

    public static int[] swap(int a, int b) {
        int temp = a; // store a
        a = b;        // put b into a
        b = temp;     // put temp (old a) into b

        return new int[]{a, b};
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swap: a = " + a + ", b = " + b);

        int[] swapped = swap(a, b);
        a = swapped[0];
        b = swapped[1];

        System.out.println("After swap:  a = " + a + ", b = " + b);
    }
}
