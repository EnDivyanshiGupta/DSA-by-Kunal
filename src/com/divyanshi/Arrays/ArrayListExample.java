package com.divyanshi.Arrays;
import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(33);
//        list.add(343);
//        list.add(675);
//        list.add(90);
//        list.add(53);
//        list.add(64);
//
//        list.add(19); //add 19 to the list
//        System.out.println(list);
//
//        list.set(0,99); //set 99 to the 0th index
//
//        list.remove(2); //remove index no 2 from the array.
//        System.out.println(list);

        //input
//        for(int i =0; i<5; i++){
//            list.add(sc.nextInt());
//        }

        //get item at any index
        for(int i =0; i<3; i++){
            System.out.println(list.get(i)); //pass index here, list[index] syntax will not work here
        }
        System.out.println(list);
    }
}
