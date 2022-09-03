package com.javaCourse.TechnicalQuestions;

import java.util.Random;

public class RandomNumber {
    Random random = new Random();

    public void randomNumber() {
        System.out.println(Math.random());
        System.out.println((int) Math.floor(Math.random() * 10));
        for (int i = 0; i <= 10; i++) {
            System.out.print((int) Math.floor(Math.random() * 10) + " ");
        }
        System.out.println();
        for (int i = 0; i <= 10; i++) {
            System.out.print(1 + random.nextInt(100) + " ");
        }
    }
}
