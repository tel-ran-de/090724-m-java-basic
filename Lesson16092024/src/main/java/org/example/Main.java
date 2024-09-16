package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getArray()));
        int[] arr = getArray();

        System.out.println("Length of the array is 3 - " + (arr.length == 3));
        System.out.println("First element in array is 1 - " + (arr[0] == 1));
        System.out.println("The array is not empty - " + (arr.length > 0));
    }

    public static int[] getArray() {
        return new int[] {1, 2, 3};
    }

    public static int getFirstNum() {
        return new int[] {1, 2, 3}[0];
    }
}