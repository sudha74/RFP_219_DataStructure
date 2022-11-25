package com.bridgelabz.datastructure;

import java.util.Arrays;

public class PrimePalineAndAnagram {
    public static boolean isAnagram(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        if (str1.length() != str2.length()) {
            return false;
        } else {
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if (Arrays.equals(arr1, arr2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPalindrome(int num) {
        int r, sum = 0;
        int temp = num;
        while (num > 0) {
            r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;
        }
        if (temp == sum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i <= 1000; i++) {
            if (PrimeNumbers.isPrime(i)) {
                for (int j = i + 1; j < 1000; j++) {
                    if (PrimeNumbers.isPrime(j)) {
                        if (isAnagram(String.valueOf(i), String.valueOf(j)) && isPalindrome(i)) {
                            System.out.println(i + " " + j + " is prime and anagram and palindrome");
                        }
                    }
                }
            }
        }

    }
}

