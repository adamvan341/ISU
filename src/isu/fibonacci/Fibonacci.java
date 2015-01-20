package isu.fibonacci;

import java.util.Scanner;

/**
 * Recursive Fibonacci Number Finder
 *
 * @author Adam Vanderneut
 */
public class Fibonacci {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Fibonacci number (Maximum 15)");
        int f = scan.nextInt();
        System.out.println(fibonacci(f));
    }

    static int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
