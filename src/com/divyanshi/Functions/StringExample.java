package com.divyanshi.Functions;

public class StringExample {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);
        String personalized = myGreet("Divyanshi");
        System.out.println(personalized);

    }

    static String myGreet(String name){
        String message = "Hello " + name;
        return message;
    }


    static String greet(){
        String greeting = "Hey! how are you";
        return greeting;
    }
}
