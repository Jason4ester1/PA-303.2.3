package org.example;

public class Main {
    public static void main(String[] args) {
        int x = 32456;
        System.out.println("Original value: " + x);
        System.out.println("Binary form: "+ Integer.toBinaryString(x));
        x = x >> 2;
        System.out.println("After left shift by 1:"+ x);
        System.out.println("Desimal value:" + x);
        System.out.println("Binary form: " + Integer.toBinaryString(x));

    }
}