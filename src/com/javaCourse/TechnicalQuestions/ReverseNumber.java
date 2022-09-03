package com.javaCourse.TechnicalQuestions;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int remainder, reverseString = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to Reverse it: ");
        int num = scanner.nextInt();
        while (num> 0){
            remainder = num%10;
            reverseString = (reverseString*10) + remainder;
            num = num/10;
        }
        System.out.println("After the process the given reverse string is: " + reverseString);
    }
}
