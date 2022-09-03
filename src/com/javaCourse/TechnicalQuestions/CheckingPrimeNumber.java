package com.javaCourse.TechnicalQuestions;

public class CheckingPrimeNumber {
    public boolean isPrime(int num){
        boolean flag = true;
        if(num == 0 || num == 1){
            flag = false;
        }else {
            for (int i=2; i<num/2; i++){
                if (num%i == 0){
                    flag = false;
                }
            }
        }
        if(flag){
            return true;
        }
        return false;
    }

    public boolean isPrime2(int num){
        int count=0;
        for (int i = 1; i <=num; i++) {
            if(num %i == 0){
                count ++;
            }
        }
        if(count == 2){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        CheckingPrimeNumber primeNumber = new CheckingPrimeNumber();
        boolean isPrime = primeNumber.isPrime(12);
        System.out.println("Is Prime Number: " + isPrime);

        boolean isPrime2 = primeNumber.isPrime2(7);
        System.out.println("Is Prime Number: " + isPrime2);
    }
}
