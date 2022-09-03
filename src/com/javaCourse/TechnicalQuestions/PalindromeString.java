package com.javaCourse.TechnicalQuestions;

public class PalindromeString {
    public static boolean isPalindrom(String string){
        int len = string.length() - 1;
        String newStr = "";
        for (int i = len; i >=0; i--) {
            newStr += string.charAt(i);
        }
        if(newStr.toLowerCase().equals(string.toLowerCase())){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom("Radar"));
    }
}
