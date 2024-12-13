package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to My Java Maven App!");
        int result = add(5, 3);
        System.out.println("The sum of 5 and 3 is: " + result);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}

