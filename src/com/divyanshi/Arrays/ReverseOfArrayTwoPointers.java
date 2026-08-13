package com.divyanshi.Arrays;

public class ReverseOfArrayTwoPointers {
    static void reverseArray(int[]arr){
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            //swap
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

    }
    public static void main(String[] args) {
        //Reverse the array using optimized approach.  ans -> Two Pointer
        int[] arr = {1, 2, 3, 4, 5};
        reverseArray(arr);
        //print the reverse array.
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
