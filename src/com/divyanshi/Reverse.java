package com.divyanshi;

public class Reverse {
    public static void main(String[] args) {
        int nums = 23597;
        int ans =0;
        while(nums > 0){
            int rem = nums % 10;
            nums/=10;
            ans = ans * 10 + rem;
        }


        System.out.println(ans);
    }


}
