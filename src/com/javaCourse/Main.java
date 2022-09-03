package com.javaCourse;

import com.javaCourse.TechnicalQuestions.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("My First Java program");
//
//        // String Concatenation
//        String firstName = "Feezan";
//        String lastName = "Khattak";
//        System.out.println(firstName + " " + lastName);
//        String fullName = firstName.concat(" ").concat(lastName);
//        System.out.println(fullName);
//
//        // ternary Operator
//        int result = 3 > 7 || 8 < 10 ?
//                Calculation.add(10, 2) : Calculation.sub(10, 5);
//        System.out.println(result);
//
//        // Arrays
//        int [] numberArray = new int[3];
//        numberArray[0] = 1;
//        numberArray[1] = 2;
//        numberArray[2] = 3;
//        System.out.println(Arrays.toString(numberArray));
//        System.out.println("Length: " + numberArray.length);
//
//        String [] names = {"Feezan", "Khan", "Khattak"};
//        System.out.println(Arrays.toString(names));
//        System.out.println("Length: " + names.length);

        // increment and decrement
        int num = 5;
//        System.out.println(num++); // 5
//        System.out.println(++num); // 7
//        System.out.println(num--); // 7
//        System.out.println(--num); // 5

        // Enhaced For Loop
//        for (int number : numberArray) {
//            System.out.println(number);
//        }

        // Get the birthday Year
//        System.out.println("Hello Sir! How old are you? ");
//        int age = scanner.nextInt();
//        int year = LocalDate.now().minusYears(age).getYear();
//        System.out.println("You were born in: " + year);

        // Fibonacci Series
        FibonacciSeries series = new FibonacciSeries();
        series.fibonacci( 10);
        System.out.println();
        series.fibonacciRecursion(10-2);
        System.out.println();

        // prime number
        PrimeNumber number =  new PrimeNumber();
        number.isPrime(3);

        // Factorial
        Factorial factorial = new Factorial();
        System.out.println(factorial.factorial(5));
        System.out.println(factorial.factorailWithOutRecursion(5));

        // Random Number
        RandomNumber randomNumber = new RandomNumber();
        randomNumber.randomNumber();
        System.out.println();

        // Array problems
        int [] arr = {1, 2, 6, 0, 1, 4, 12};
        ArraysProblem problem = new ArraysProblem();
        System.out.println(problem.isNumberPresentInArray(arr,2));
        System.out.println(problem.maximumNumberInArray(arr));
        System.out.println(problem.minimumNumberInArray(arr));
        System.out.println(problem.countDuplicatesNumberInArray(arr, 1));
        System.out.println(problem.countGreaterNumberInArray(arr, 6));
        System.out.println(problem.countMinimumNumberInArray(arr, 12));
        System.out.println();
        problem.asscendingOrderArray(arr);
        System.out.println();
        problem.decendingOrderArray(arr);
        System.out.println();
        String[] strArr = {"Feezan", "Rabia", "Qasim", "Khattak"};
        problem.stringArraySorting(strArr);
        System.out.println();

        for(int i = 0; i<20; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Interview Questions");
        int [] arr1 = {1,2,3,6};

        int sum = 0;
        for (int i = 0; i <= arr1.length-2; i++) {
            sum += arr1[i];
        }

        if(sum == arr1[arr1.length-1]){
            System.out.println("Yes done");
        }else{
            System.out.println("No failed");
        }

    }

    // Sample class for Ternary Operator
    static class Calculation {
        public static int add(int a, int b) {
            return a + b;
        }

        public static int sub(int a, int b) {
            return a - b;
        }
    }
}
