package com.divyanshi.Recursion;
import java.util.*;
public class PowerLinear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base: ");
        int a = sc.nextInt();
        System.out.println("Enter exponent: ");
        int b = sc.nextInt();
        System.out.println( a + " raised to power "  + b + " is " + pow(a,b));
    }
    static int pow(int a, int b){
        if(b == 0) return 1;
        return a * pow(a, b-1) ;

    }
}
