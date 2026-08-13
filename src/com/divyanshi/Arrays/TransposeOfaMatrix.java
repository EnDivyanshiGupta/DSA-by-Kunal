package com.divyanshi.Arrays;
import java.util.Scanner;
public class TransposeOfaMatrix {
    static void PrintMatrix(int[][]matrix){
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j< matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void transposeInPlace(int[][] matrix, int r, int c){
        for(int i=0; i<c; i++){
            for(int j=i; j<r; j++){    //i se isliye start kr rhe h taki vo 2 baar swap n ho or same ans n aaye
                //swap A[i][j], A[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

    }
    static int[][] transpose(int[][]matrix, int r, int c){
        int[][] ans = new int[c][r];

        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the Matrix : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalElements = r*c;
        System.out.println("Enter " + totalElements + "values : ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix: ");
        PrintMatrix(matrix);        //this is a helper method.

        System.out.println("Transpose of a matrix: ");
        transposeInPlace(matrix, r, c);
        PrintMatrix(matrix);
//        int[][] ans = transpose(matrix, r, c);
//        PrintMatrix(ans);
    }
}
