package com.divyanshi.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 40, 30, 35};
        int largeElement = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largeElement){
                largeElement = arr[i];

            }
        }
        System.out.println("The largest element is : " + largeElement);
    }
}
