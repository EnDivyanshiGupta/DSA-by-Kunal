package com.divyanshi.Arrays;
import java.util.*;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[]arr = new int[5];
//        arr[0] = 23;
//        arr[1] = 56;
//        arr[2] = 53;
//        arr[3] = 97;
//        arr[4] = 18;
//        System.out.println(arr[3]);
//
//        //input using for loops.
//        for(int i = 0; i<arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//        for(int i = 0; i<arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }

        //array of objects
        String[] str = new String[4];
        for(int i = 0; i<str.length; i++){
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "Divyanshi";
        System.out.println(Arrays.toString(str));

    }
}
