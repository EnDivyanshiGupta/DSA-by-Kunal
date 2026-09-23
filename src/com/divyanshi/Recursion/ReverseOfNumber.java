package com.divyanshi.Recursion;

public class ReverseOfNumber {
    static int reverseNo(int n, int reverse){
        if(n == 0){
            return reverse;
        }
        int digit = n%10;
        reverse = reverse * 10 + digit;
        return reverseNo(n/10, reverse);

    }
    public static void main(String[] args) {
        int n = 1234;
        int result = reverseNo(n,0);
        System.out.println(result);
    }

}
