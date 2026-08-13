package com.divyanshi.Arrays;

public class SortArray {
    static void sortArray(int[]arr){
        int countZeroes = 0;
        //this loop is to count the no of zeroes.
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                countZeroes++;
            }
        }
        //this loop is to filled os ans 1s.
        for(int i=0; i<arr.length; i++){
            if(i<countZeroes){
                arr[i] = 0;
            }
            else{
                arr[i] = 1;
            }
        }
    }
    public static void main(String[] args) {
        //sort an array consisting of only 0s and 1s.
        int[] arr = {8, 0, 5, 5, 0, 1, 8, 0, 0};
        sortArray(arr);
        //now print the sorted array.
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
