package com.divyanshi.OOPs;

public class Introduction {
    public static void main(String[] args) {
        //store 5 roll no
        int[]arr = new int[5];

        //store names of 5 student
        String[]names = new String[5];

        //data of 5 students:{name , rollno , marks}
        String[]name = new String[5];
        int[]rollno = new int[5];
        float[]marks = new float[5];
        //this is good but i wanted it in a single line. some sort of data structures in which every data structure contain these three things

        Student[]students = new Student[5];
    }

    //create a class
    class Student{
        int[]rollnum = new int[5];
        String[]namess = new String[5];
        float[] mark = new float[5];
    }
}
