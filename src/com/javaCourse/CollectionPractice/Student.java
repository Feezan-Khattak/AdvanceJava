package com.javaCourse.CollectionPractice;

import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private int rollNo;


    public Student(String firstName, String lastName, int rollNo){
        this.firstName = firstName;
        this.lastName = lastName;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }
}
