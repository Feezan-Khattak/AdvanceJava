package com.javaCourse.Topics;

public class ConstructorChaining {

    ConstructorChaining() {
        System.out.println("This is the empty Constructor");
        System.out.println("This is the demonstration program to explain constructor chaining");
    }

    ConstructorChaining(int age, String name) {
        this(age);
        System.out.println("You are welcome to the two parameter constructor");
        System.out.println("You are Mr/Mrs " + name + " and you are currently " + age);
    }

    ConstructorChaining(int age) {
        this();
        System.out.println("You are " + age);
    }

    public static void main(String[] args) {
        ConstructorChaining chaining = new ConstructorChaining(25, "Feezan Khattak");
    }
}
