package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr));
    }

    static int numMin(int[] arr) {
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
        return nMin;
    }

}