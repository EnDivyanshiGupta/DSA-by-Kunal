package com.divyanshi;

public class Conditional {
    public static void main(String[] args) {
        int salary = 25400;
//        if(salary > 10000){
//            salary = salary +2000;
//        }
//        else{
//            salary = salary +1000;
//        }
//        System.out.println(salary);

        //Multiple if-else statements
        if(salary > 5000){
            salary = salary+1000;
        }
        else if(salary>10000){
            salary = salary+2000;
        }
        else{
            salary = salary +5000;
        }
        System.out.println(salary);
    }
}
