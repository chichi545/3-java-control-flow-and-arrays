package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void swap(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        } else {
            int min = arr[0];
            int nMin = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (min == arr[i]) {
                    nMin = i;
                }
            }
            int t = arr[0];
            arr[0] = arr[nMin];
            arr[nMin] = t;
        }
    }
}