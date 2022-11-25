package com.bridgelabz.datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static boolean findAnagram(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        if (str1.length() != str2.length()) {
            return false;
        } else {
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if (Arrays.equals(arr1, arr2)) {
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1, str2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter String One");
        str1 = scanner.next();
        System.out.println("Enter String Two");
        str2 = scanner.next();

        boolean result = findAnagram(str1, str2);

        if (result) {
            System.out.println("Two strings are anagram");
        } else {
            System.out.println("Two strings are not anagram");
        }
    }
}
