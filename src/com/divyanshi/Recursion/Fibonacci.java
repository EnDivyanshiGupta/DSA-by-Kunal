package com.divyanshi.Recursion;
import java.util.Scanner;
public class Fibonacci {
    static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }

        int prev = fibo(n-1);
        int prevPrev = fibo(n-2);

        return prev + prevPrev;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }
}
