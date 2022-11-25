package com.bridgelabz.datastructure;

import java.util.Arrays;

public class InsertionSort {
    public void insertionSort(String[] array) {

        for (int i = 0; i < (array.length - 1); i++) {
            String str = array[i + 1];

            while (i >= 0 && ((str.compareTo(array[i])) < 0)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = str;
        }
    }

    public static void main(String[] args) {
        String[] data = {"Nive", "Abhi", "Sagar", "Sudha", "Megha"};
        InsertionSort insert = new InsertionSort();
        insert.insertionSort(data);
        System.out.println("Sorted Array : ");
        System.out.println(Arrays.toString(data));

    }
}

