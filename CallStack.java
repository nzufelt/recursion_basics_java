// Examining the Call Stack
// Author: Nicholas Zufelt
// Course: CSC500
// Date: 4/19/2021

public class CallStack {
    public static void outerMethod() {
        System.out.println("Entering the outer method");
        innerMethod();
        System.out.println("Exiting the outer method");
    }

    public static void innerMethod() {
        System.out.println("Entering the inner method");
        // Do something
        System.out.println("Tough calculation happened!");

        System.out.println("Exiting the inner method");
    }

    public static void main(String[] args) {
        System.out.println("Entering the main method");
        outerMethod();
        System.out.println("Exiting the main method");
    }
}