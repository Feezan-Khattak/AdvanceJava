package com.javaCourse.TechnicalQuestions;

public class PalindromeNumber {
    public boolean isPalindrome(int num){
        int copyOfNum = num, remainder, palindromeNum =0;
        while (num > 0){
            remainder = num%10;
            palindromeNum = (palindromeNum * 10)  + remainder;
            num = num/10;
        }
        if(copyOfNum == palindromeNum){
            System.out.println(palindromeNum);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean isPalindrome = palindromeNumber.isPalindrome(131);
        if(isPalindrome){
            System.out.println("yes, it is Palindrome number");
        }else{
            System.out.println("No! it's not Palindrome number");
        }
    }
}
