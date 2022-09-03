package com.javaCourse.TechnicalQuestions;

public class ArmstrongNumber {
    public boolean isArmStrong(int num){
        int copyOfNum = num;
        double armNum = 0;
        int remainder;
        while(num > 0){
            remainder = num%10;
            armNum = Math.pow(remainder, 3) + armNum;
            num = num/10;
        }
        if(copyOfNum == armNum){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ArmstrongNumber armstrongNumber = new ArmstrongNumber();
        boolean isArmNum = armstrongNumber.isArmStrong(133);
        if(isArmNum){
            System.out.println("yes it is armstrong number");
        }else{
            System.out.println("Not it's not armstrong number");
        }
    }
}
