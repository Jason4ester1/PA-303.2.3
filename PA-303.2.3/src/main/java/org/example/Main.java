package org.example;

public class Main {
    public static void main(String[] args) {
        int x = 7;
        int y = 17;
        int z = x & y;
        z = x | y;
        System.out.println("Task 4:");
        System.out.println("x:" + x +"(" + Integer.toBinaryString(x) + ")" );
        System.out.println("x:" + y +"(" + Integer.toBinaryString(y) + ")" );
        System.out.println("x:" + z +"(" + Integer.toBinaryString(z) + ")" );
        System.out.println("Binary form: "+ Integer.toBinaryString(x));

    }
}