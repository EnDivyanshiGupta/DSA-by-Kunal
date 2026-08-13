package com.divyanshi.Arrays;

public class Main {
    public static void main(String[] args) {
        //Q. Store a roll no.
        int a = 19;

        //Q. Store a person's name.
        String name = "Divyanshi Gupta";

        //Q. Store the roll no of 5 students.
        int rolln1 = 1;
        int rolln2 = 2;
        int rolln3 = 3;
        // if you would say that store 500 roll no do you do it for 500 times.  -> no here we need array
        //array is the collection of same data types.

        //Syntax
        // datatype [] variable_name = new datatype[size];

        //Store 5 roll no.
        int[] rollnum = new int[5];

        //or directly
        int[] rnos = {12, 34, 54,63, 29};

        // int rollnum; //declaration of an aray. rollnum is getting defined in the stack.
        // rollnum = new int[5]; // initialization: actually here object is being created in the memory (heap memory).
    }
}
