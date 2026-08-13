package com.divyanshi.Arrays;

import java.util.Arrays;

public class example {
    public static void main(String[] args) {
//        int[] arr = {12, 14, 65};
//        for(int i =0; i<3; i++){
//            System.out.println(arr[i]);
//        }

//        for(int num: arr){
//            System.out.println(arr);
//        }

//        int i =0;
//        while(i<3){
//            System.out.println(arr[i]);
//            i++;
//        }

        int[][]ages = {{12, 45, 87},{53, 98, 43}};
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.println(ages[i][j]);
            }
        }
    }
}
