package com.javaCourse.CollectionPractice;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListPractice {
    public void show(){
        Queue<Integer> qu = new LinkedList<>();
        // add element at thee queue
        qu.offer(10);
        qu.offer(10);
        qu.offer(100);
        qu.offer(-24);

        System.out.println(qu);

        // delete the delete element
        qu.poll();
        qu.poll();
        System.out.println(qu);

        // see the top element at the queue
        System.out.println(qu.peek());

    }
}
