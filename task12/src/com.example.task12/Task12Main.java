package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        swap(swap(arr, 0), 1);
    }
    static int[] swap(int[] arr, int num) {
        int min = arr[num];
        int nMin = 0;
        for (int i = num + 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (min == arr[i]) {
                nMin = i;
            }
        }
        int t = arr[num];
        arr[num] = arr[nMin];
        arr[nMin] = t;
        return arr;
    }
}