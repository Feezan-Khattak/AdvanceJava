package com.javaCourse.TechnicalQuestions;

public class SwappingNumber {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("Before Swapping");
        System.out.println("A: " + a + " B: " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping without using third variable");
        System.out.println("A: " + a + " B: " + b);
    }
}
