package com.javaCourse.CollectionPractice;

import java.util.Iterator;
import java.util.Stack;

public class StactPractice {
    public void show(){
        Stack<String> animal = new Stack<>();
        animal.push("Lion");
        animal.push("Tiger");
        animal.push("Rat");
        animal.push("Elephant");

        System.out.println(animal.peek());
        Iterator<String> iterator = animal.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(animal.pop());
        System.out.println(animal.peek());
    }
}
