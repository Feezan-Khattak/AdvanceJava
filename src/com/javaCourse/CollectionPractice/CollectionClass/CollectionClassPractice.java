package com.javaCourse.CollectionPractice.CollectionClass;

import java.util.*;

public class CollectionClassPractice {
    public static void main(String[] args) {
        // The collection class is used to provide some basic function for the data
        // structure and make our work easy.

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(0);
        list.add(9);
        list.add(42);
        list.add(42);
        list.add(42);
        list.add(12);
        list.add(12);
        list.add(10);

        // try to find the maximum number inside the list
        System.out.println(Collections.max(list));

        // try to find the minimum number inside the list
        System.out.println(Collections.min(list));

        // try to find the frequency of certain number inside the list
        System.out.println(Collections.frequency(list, 42));

        // try to sort the list in ascending order
        Collections.sort(list);

        System.out.println(list);

        // try to sort the list in descending order
        Collections.sort(list, Comparator.reverseOrder());

        System.out.println(list);

    }
}
