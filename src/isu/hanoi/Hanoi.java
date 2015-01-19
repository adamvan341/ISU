package isu.hanoi;

import java.util.Scanner;

/**
 * Towers of Hanoi
 *
 * @author Adam Vanderneut
 */
public class Hanoi {

    static int moves = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;

        int rings;

        do {
            System.out.println("Enter number of rings from 3 to 10: ");
            rings = scan.nextInt();
        } while (rings < 3 || rings > 10);

        move(rings, 1, 3, 2);

    }

    public static void move(int n, int i, int j, int k) {
        if (n > 0) {
            moves++;
            move(n - 1, i, k, j);
            System.out.println("Move ring " + n + " from peg " + i + " to peg " + j);
            move(n - 1, k, j, i);
        }
    }

}
