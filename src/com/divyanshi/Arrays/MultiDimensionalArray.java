package com.divyanshi.Arrays;
import java.util.Scanner;
public class MultiDimensionalArray {
    static void PrintArray(int[][] arr){

        for(int i=0; i<arr.length; i++){
         //   System.out.println(arr[i]);
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int r = sc.nextInt();
        System.out.println("ENter no. of columns: ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];     //size of array is 2*3 = 6.

        System.out.println("Enter " + r*c + " elements : ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
//        int[][] arr2 = { {1, 2, 3},
//                         {4, 5, 6},
//                         {7, 8, 9}
//                       };
        PrintArray(arr);

    }
}
