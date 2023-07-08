package com.example.grokking_algorithms.chapter_3;

public class Factorial {

    public static int factorial(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

}