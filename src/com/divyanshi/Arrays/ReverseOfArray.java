package com.divyanshi.Arrays;

public class ReverseOfArray {
    static void reverseArray(int[]arr){
        int n = arr.length;

        for(int i=n-1;i>=0; i-- ){
            System.out.print(arr[i] + " ");
        }

    }
    public static void main(String[] args) {
        //Q. Reverse an array consisting of integer values.
        int[] arr = {1, 2, 3, 4, 5};  // our ans should be {5, 4, 3, 2, 1};

        reverseArray(arr);


    }
}
