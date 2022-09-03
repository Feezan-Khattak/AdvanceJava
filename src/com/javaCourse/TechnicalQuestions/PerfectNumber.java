package com.javaCourse.TechnicalQuestions;

public class PerfectNumber {
    public boolean isPerfect(int num){
        int copyOfNum = num, remainder, sumOfNum = 0;
        for (int i = 1; i< num; i++){
            if(num%i == 0){
                sumOfNum += i;   // 1 + 2 + 3 = 6
            }
        }
        if(copyOfNum == sumOfNum){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        PerfectNumber perfectNumber = new PerfectNumber();
        boolean isPerfect = perfectNumber.isPerfect(7);
        if(isPerfect){
            System.out.println("The number is perfect");
        }else{
            System.out.println("The number is not perfect");
        }
    }
}
