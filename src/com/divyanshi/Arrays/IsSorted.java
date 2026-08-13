package com.divyanshi.Arrays;

public class IsSorted {
    static boolean isSorted(int[]arr){
        boolean check = true;
        for(int i=1; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                check = false;

            }
        }
        return check;

    }
    public static void main(String[]args){
        int[]arr = {1,2,3,4,5,8,7};
        boolean ans = isSorted(arr);
        System.out.println("Is sorted: " + ans);

    }
}
