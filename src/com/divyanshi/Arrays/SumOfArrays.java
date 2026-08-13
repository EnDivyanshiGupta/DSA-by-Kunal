package com.divyanshi.Arrays;

public class SumOfArrays {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = {1, 5, 3};
        for(int i =0; i<arr.length; i++){
             sum = sum + arr[i];
        }
        System.out.println("The sum of the array is : " + sum);
    }
}
