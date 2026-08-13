package com.divyanshi.Arrays;

public class SearchGivenElement {
    public static void main(String[] args) {
        int [] arr = {1, 5, 3};
        int x = 5;
        int ans = -1;
        for(int i =0; i<arr.length; i++){
            if(x == arr[i]){
                ans = i;
                break;
            }
        }

        System.out.println(ans);

    }
}
