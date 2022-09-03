package com.javaCourse.TechnicalQuestions;

public class Factorial {
    public int factorial(int number){
        if(number == 0){
            return 1;
        }else{
            return (number * factorial(number -1 ));
        }
    }

    public int factorailWithOutRecursion(int num){
        int fact = 1;
        if(num == 0){
            return 1;
        }else{
            for (int i=1; i<=num; i++){
                fact *= i;
            }
        }
        return fact;
    }
}
