package com.divyanshi.Arrays;

public class CountFrequency {
    static int CountOccurence(int[]arr, int x){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr ={5, 6, 7, 5, 8, 9, 5};
        int x = 5;
        int ans = CountOccurence(arr, x);
        System.out.println("Occurence of " + x + "is :" + ans );

    }
}
