package com.javaCourse.CollectionPractice;

import java.util.ArrayDeque;
import java.util.Queue;

public class DequePractice {
    public  void show(){
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        // Adding item back and forth of the dequeue
        dq.offer(100);
        dq.offerFirst(5);
        dq.offerLast(106);

        System.out.println(dq);

        // peak the item from back and forth of the dequeue
        System.out.println(dq.peek());
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());


        // poll the item from back & forth of the dequeue
        System.out.println(dq.poll());
        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());

    }
}
