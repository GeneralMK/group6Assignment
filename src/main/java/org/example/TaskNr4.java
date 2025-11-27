package org.example;

import java.util.Locale;
import java.util.Scanner;

public class TaskNr4 {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        ab.useLocale(Locale.US);

        System.out.println("Enter first number: ");
        int c = ab.nextInt();

        System.out.println("Enter second number: ");
        int d = ab.nextInt();

        System.out.println("Sum: " + (c+d));
        System.out.println("Difference: " + (c-d));
        System.out.println("Product: " +(c*d));
        System.out.println("Division: " + ((double)c/d));
    }
}
