package com.divyanshi.Recursion;

public class SOD {
    static int sumOfDigits(int n){
        if(n>=0 && n<=9){
            return n;
        }
        int smallAns = sumOfDigits(n/10);
        return smallAns + n%10;
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1234));

    }
}
