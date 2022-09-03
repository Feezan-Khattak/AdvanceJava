package com.javaCourse.CollectionPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListPractice {
    public void show(){
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(50, 1);

        System.out.println(list);
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(list.contains(10));

        list.remove(1);
        list.clear();
        System.out.println(list);
    }
}
