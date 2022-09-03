package com.javaCourse.TechnicalQuestions;

import java.util.ArrayList;

public class FibonacciSeries {
    // without Recursion
    public void fibonacci(int count) {
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1 + " " + n2);
        int n3;
        for (int i = 2; i < count; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }

    public void fibonacci2(int end){
        int n1 =0, n2 = 1, n3;
        for (int i = 1; i <= end; i++) {
            System.out.print(n1 + " ");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }

    // Using recursion
    public void fibonacciRecursion(int count) {
        int n1 = 0, n2 = 1, n3 = 0;
        System.out.print(n1 + " " + n2);
        if (count > 0) {
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
            System.out.print(" " + n3);
            fibonacciRecursion(count - 1);
        }
    }

    // using Tail Recursion
    public int fibonacciTailRecursion(int num){
        if(num == 1 || num == 2){
            return 1;
        }
        return fibonacciTailRecursion(num - 1) + fibonacciTailRecursion(num -2);
    }

    public static void main(String[] args) {
        FibonacciSeries series = new FibonacciSeries();
        int num = 10;
        for (int i = 1; i < num; i++) {
            System.out.print(series.fibonacciTailRecursion(i) + " ");
        }

        System.out.println();
        series.fibonacci2(20);
    }
}
