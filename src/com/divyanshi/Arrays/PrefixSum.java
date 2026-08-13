package com.divyanshi.Arrays;

public class PrefixSum {
    static int[] prefixSumArray(int[]arr){
        //int[]pref = new int[5];
        //pref[0] = arr[0];

        for(int i=1; i<arr.length; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 5};
        int[] ans = prefixSumArray(arr);
        //for printing the array
        for(int i=0; i<arr.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
