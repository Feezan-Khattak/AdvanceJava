package com.javaCourse.CollectionPractice;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetPractice {
    public void show() {
        // set is a data structure that doesn't allow duplicate items
        // internally it use the technique of hashing. i.e every item gets
        // an unique address that represent that value. therefore when we print the
        // set its order is changed very time

        Set<String> strSet = new LinkedHashSet<>();

        strSet.add("Feezan");
        strSet.add("Khattak");
        strSet.add("Rabia");
        strSet.add("Qasim");

        System.out.println(strSet);

        // try to add the duplicates items
        strSet.add("Feezan");
        strSet.add("Rabia");

        System.out.println(strSet);

        // remove the item from the set
        strSet.remove("Qasim");
        strSet.remove("khattak");

        System.out.println(strSet);

        // check it the items is present in the set or not
        System.out.println(strSet.contains("Rabia"));
        System.out.println(strSet.contains("feezan"));

        // checking if the set is empty or not
        System.out.println(strSet.isEmpty());

        // checking the size of the set
        System.out.println(strSet.size());

        // clearing the set
        strSet.clear();
        System.out.println(strSet);
    }
}
