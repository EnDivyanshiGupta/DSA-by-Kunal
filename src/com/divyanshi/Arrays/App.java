package com.divyanshi.Arrays;
import java.util.Scanner;
public class App {

     static void printArray(int[]arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
         System.out.println();
    }
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        //for taking i/p
        System.out.println("Original Array:");
       printArray(arr);

        //we have to copied the elements of first array into second array.
        int[] arr_2 = arr;
        //for print the elements of the array again we need to run the loop again isse accha hai ki printArray naam
        //ka function bnao or jab jarurat ho tab call krlo simple as that.
        System.out.println("Copied Array:");
        printArray(arr_2);
    }
}
