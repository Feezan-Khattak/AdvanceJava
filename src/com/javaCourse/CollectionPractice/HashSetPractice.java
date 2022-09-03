package com.javaCourse.CollectionPractice;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {

    HashSet<Student> students = new HashSet<>();

    /*we are going to use the hashset with some practicle example suppose we have students
    with some proerties and we are not allowed two students with the same roll number
    for this we have to make the equals and hashCode method inside the student class
    so that we tell the hashset to not add the students with the same rollno. */

    public  void show() {
        students.add(new Student("Feezan", "khatkak", 1714));
        students.add(new Student("Rabia", "Qasim", 1714));
        students.add(new Student("Irfan", "Khan", 1714));
        students.add(new Student("Feezan", "khattak", 1714));

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
