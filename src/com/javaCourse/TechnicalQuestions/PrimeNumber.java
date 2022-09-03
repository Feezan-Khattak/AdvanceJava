package com.javaCourse.TechnicalQuestions;

public class PrimeNumber {
    public void isPrime(int num){
        int m  =0 , flag = 0;
        m = num/2;
        if(num == 0 || num == 1){
            System.out.println(num + " is not prime");
        }else{
            for(int i =2; i<=m; i++){
                if(num%i == 0){
                    flag = 1;
                    System.out.println(num + " is not prime");
                }
            }
            if(flag == 0){
                System.out.println(num + " is prime number");
            }
        }
    }
}
