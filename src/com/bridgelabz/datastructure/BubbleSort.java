package com.bridgelabz.datastructure;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        int temp;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - 1); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10, 1, 3, 5, 7, 9, 11};

        System.out.println("Array List is : ");
        for (int i : array) {
            System.out.println(i + " ");
        }
        System.out.println();

        bubbleSort(array);
        System.out.println("Array after applying Bubble Sort: ");
        for (int i : array) {
            System.out.println(i + " ");
        }
    }
}
