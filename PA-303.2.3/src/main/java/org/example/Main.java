package org.example;

public class Main {
    public static void main(String[] args) {
        int b = 10;
        System.out.println("Task 6:");
        // Method 1
        System.out.println("Original value: " + b);
        b++;
        System.out.println("After increment (Method 1): " + b);
        // Method 2
        b += 1;
        System.out.println("After increment (Method 2): " + b);
        // Method 3
        b = b + 1;
        System.out.println("After increment (Method 3): " + b);
        System.out.println();

    }
}