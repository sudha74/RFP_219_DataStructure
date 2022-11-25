package com.bridgelabz.datastructure;

public class MergeSort {
    public void merge(int[] arr, int p, int q, int r) {

        int n1 = q - p + 1;
        int n2 = r - q;

        int[] subArray1 = new int[n1];
        int[] subArray2 = new int[n2];

        for (int i = 0; i < n1; i++)
            subArray1[i] = arr[p + i];
        for (int j = 0; j < n2; j++)
            subArray2[j] = arr[q + 1 + j];


        int i, j, k;
        i = 0;
        j = 0;
        k = p;

        while (i < n1 && j < n2) {
            if (subArray1[i] <= subArray2[j]) {
                arr[k] = subArray1[i];
                i++;
            } else {
                arr[k] = subArray2[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = subArray1[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = subArray2[j];
            j++;
            k++;
        }
    }


    void mergeSort(int[] arr, int left, int right) {
        if (left < right) {

            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    static void printArray(int[] arr) {
        for (int j : arr)
            System.out.print(j + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {6, 5, 12, 10, 9, 1};

        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}

