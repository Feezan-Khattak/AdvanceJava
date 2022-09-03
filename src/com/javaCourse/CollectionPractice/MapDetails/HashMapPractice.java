package com.javaCourse.CollectionPractice.MapDetails;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {

        // Map is a data structure that is used to store the key value pair, it has
        // different implementation like hash map.

        Map<Integer, String> stringMap = new HashMap<>();

        // try to add key value inside the hash map
        stringMap.put(1, "Feezan");
        stringMap.put(2, "Khattak");
        stringMap.put(3, "Khan");

        System.out.println(stringMap);

        // try to add the duplicate key and value, it will override the value
        stringMap.put(2, "Rabia");
        System.out.println(stringMap);

        //  try to ignore the duplicates key and value, i.e if the key is already present
        // then not to override its value
        stringMap.putIfAbsent(2, "Hammad");
        System.out.println(stringMap);

        // try to iterate over the hash map. to print both keys and value
        for (Map.Entry<Integer, String> e : stringMap.entrySet()) {
            System.out.println(e);
        }

        // try to print only keys of the hash map
        for (Integer key : stringMap.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();

        // try to print the values only
        for (String value : stringMap.values()) {
            System.out.print(value + " ");
        }

        System.out.println();

        // try to remove the key value pair by using the key
        stringMap.remove(3);
        System.out.println(stringMap);

        // check if the value is present or not
        System.out.println(stringMap.containsValue("Feezan")); // return true or false

        // check if the key is present or not
        System.out.println(stringMap.containsKey(6)); // return true or false

        // try to check if the hashmap is empty or not
        System.out.println(stringMap.isEmpty()); // return true or false
    }
}
