package com.javaCourse.TechnicalQuestions;

public class ArraysProblem {
    public boolean isNumberPresentInArray(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }

    public int maximumNumberInArray(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[index]) {
                index = i;
            }
        }
        return arr[index];
    }

    public int minimumNumberInArray(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[index]) {
                index = i;
            }
        }
        return arr[index];
    }

    public int countDuplicatesNumberInArray(int[] arr, int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        return count;
    }

    public int countGreaterNumberInArray(int[] arr, int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > num) {
                count++;
            }
        }
        return count;
    }

    public int countMinimumNumberInArray(int[] arr, int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < num) {
                count++;
            }
        }
        return count;
    }

    public void asscendingOrderArray(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int item : arr) {
            System.out.print(item + " ");
        }

    }

    public void decendingOrderArray(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

    public void stringArraySorting(String [] arr){
        String temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if(arr[j].compareTo(arr[j+1]) > 0){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (String item : arr) {
            System.out.print(item + " ");
        }
    }
}
