package com.divyanshi;
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //Find the largest of 3 numbers.
//        int max = a;
//        if(b>a){
//            max = b;
//        }
//        if(c>b){
//            max = c;
//        }
//        System.out.println(max);

        int max = 0;
        if(a>b) {
            max = a;
        }
            else{
                max = b;
            }
            if (c>max){
                max = c;
            }


        System.out.println(max);

    }
}
