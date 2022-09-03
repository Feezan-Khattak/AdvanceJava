package com.javaCourse.CollectionPractice.ArrayClasses;

import java.awt.image.BaseMultiResolutionImage;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayClass {
    // Array class extra functionality to the primitive type array i.e simple array
    // we can perform different operation on it like, binary search, sort etc
    public static void main(String[] args) {

    int [] arr = {43, 1, 75, 84, 13, 0, 235, 53, 12, 12, 1, -54};

        int index = Arrays.binarySearch(arr, 75);
        System.out.println("The value is present at index " + index);

        Arrays.sort(arr);
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();

        // try to fill out whole array with some number like
        Arrays.fill(arr, -1);

        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
