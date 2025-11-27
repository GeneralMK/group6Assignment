package masixolekondile;

public class Fruits {

    // Method that receives an array of Strings and prints each fruit on a new line
    public static void printFruits(String[] fruits) {
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Orange", "Mango", "Grapes"};
        printFruits(fruits);
    }
}
