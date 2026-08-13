package com.divyanshi.Arrays;

public class TripletSum {
    static int tripleSum(int[] arr, int target){
        int ans=0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length-1; j++){
                for(int k=j+1; k<arr.length; k++){
                    if(arr[i] + arr[j] + arr[k] == target){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4,5 ,6, 3};
        int target = 12;
        System.out.println(tripleSum(arr, target));

    }
}
