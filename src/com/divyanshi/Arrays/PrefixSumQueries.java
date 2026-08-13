package com.divyanshi.Arrays;
import java.util.Scanner;
public class PrefixSumQueries {
    static int[] prefixSumQueries(int[]arr){
        for(int i=1; i<arr.length; i++){
            arr[i] += arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        //print the array.
        System.out.println("enter " + n + " elements: ");
        for(int i=1; i<=n; i++){
            arr[i] = sc.nextInt();
        }
        int[]prefSum = prefixSumQueries(arr);
        System.out.println("Enter the no. of queries: ");
        int q = sc.nextInt();
        System.out.println("q = " + q);

        while(q-->0){
            System.out.println("Enter range: ");

            int l = sc.nextInt();

            int r = sc.nextInt();

            int ans = prefSum[r] - prefSum[l-1];
            System.out.println("Sum " + ans);
        }
    }
}
