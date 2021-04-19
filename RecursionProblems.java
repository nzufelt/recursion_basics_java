// Solutions to common/basic recursion problems
// Author: Nicholas Zufelt
// Course: CSC500
// Date: 4/19/2021

public class RecursionProblems {
    // factorial
    public static int factorial(int n) {
        // base case 
        if (n == 1)
            return 1;

        // recursive step 
        return n * factorial(n - 1);
    }

    // Sum up an array
    public static int sum(int[] input, int startingIndex) {
        // base case
        if (input.length - 1 == startingIndex) {
            return input[input.length - 1];
        }

        // recursive step
        return input[startingIndex] + sum(input, startingIndex + 1);
    }

    // Find minimum of array
    public static int minimum(int[] input, int startingIndex) {
        // base case
        if (input.length - 1 == startingIndex) {
            return input[input.length - 1];
        }


        // recursive step
        int minOfSubArray = minimum(input, startingIndex + 1);
        if (input[startingIndex] < minOfSubArray) {
            return input[startingIndex];
        } else {
            return minOfSubArray;
        }
    }





    
    // print out a triangle?
    public static void printTriangle(int n) {
        printTriangle(1, n);
    }

    private static void printTriangle(int m, int maximum) {
        if (m == maximum + 1)
            return;
        for (int i = 0; i < m; i++) {
            System.out.print("*");
        }
        System.out.println();
        printTriangle(m + 1, maximum);
        for (int i = 0; i < m; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // System.out.println(factorial(5));

        //            0  1  2  3  4  5
        // int[] test = {5, 3, -4, 2, 1, 6};
        // System.out.println(sum(test, 0));

        // System.out.println(minimum(test, 0));

        printTriangle(5);
        System.out.println();
        printTriangle(3);
        System.out.println();
        printTriangle(8);
    }
}
