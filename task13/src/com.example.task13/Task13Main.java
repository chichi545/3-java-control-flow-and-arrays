package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        int[] arr = {9, 1100, 7, 8};
        arr = removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 1000) {
                count++;
            }
        }
        int[] output = new int[arr.length - count];
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < 1000) {
                output[i] = arr[j];
                i++;
            } else {
                continue;
            }

        }
        return output;
    }

}