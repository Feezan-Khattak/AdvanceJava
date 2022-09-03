package com.javaCourse.CollectionPractice;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PrioporityQueuePractice {
    public void show(){
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(6);
        pq.add(-45);
        pq.add(87);
        pq.add(12);
        pq.add(90);

        // priority queue implements the min and max heap, by default it
        // implement min heap
        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq.peek());

        // now the priority queue with max heap implementation
        Queue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());

        pq1.add(10);
        pq1.add(20);
        pq1.add(30);
        pq1.add(40);
        pq1.add(50);

        System.out.println(pq1);
        System.out.println(pq1.peek());
        System.out.println(pq1.poll());
    }
}
