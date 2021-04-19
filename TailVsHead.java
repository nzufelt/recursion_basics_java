// Examining the "tail" versus the "head" of a recursive function
// Author: Nicholas Zufelt
// Course: CSC500
// Date: 4/19/2021

public class TailVsHead {
    public static void printNumbers(int n) {
        // base case 
        if (n == 0) 
            return;

        // do the "head" work
        System.out.println("head: " + n);

        // recursive step
        printNumbers(n - 1);

        // do the "tail" work
        System.out.println("tail: " + n);
    }

    public static void main(String[] args) {
        printNumbers(5);
        System.out.println();
    }
}
