package com.divyanshi.Functions;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
//        int ans = sum2();
//        System.out.println(ans);
        int ans = sum3(20,30);
        System.out.println(ans);



    }
    //pass the value of numbers when you are calling the method in maim
    static int sum3(int a , int b){
        int sum = a + b;
        return sum;

    }

    //return the value.
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second num:");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum;
    }
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second num:");
        int num2 = sc.nextInt();
        int ans = num1 + num2;
        System.out.println("The sum of two nums are " + ans);
    }
    /*
        access modifier(we'll look in oop) return_type name(arguments){
           body
           return statement;

        }
         */
}
