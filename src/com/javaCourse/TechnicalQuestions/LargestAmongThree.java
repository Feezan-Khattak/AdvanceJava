package com.javaCourse.TechnicalQuestions;

public class LargestAmongThree {
    public int largestNumber(int a, int b, int c){
        int largest = 0;
        if(a> b){
            largest = a;
        }else{
            largest = b;
        }
        if (c > largest){
            largest= c;
        }

        return largest;
    }

    public int largestNumber2(int a, int b, int c){
        int largest = Math.max(a, b);
        return Math.max(c, largest);
    }

    public static void main(String[] args) {
        LargestAmongThree largestAmongThree = new LargestAmongThree();
        int i = largestAmongThree.largestNumber(10, 270, 223);
        System.out.println(i);

        int i1 = largestAmongThree.largestNumber2(10, 45, -12);
        System.out.println(i1);

    }
}
