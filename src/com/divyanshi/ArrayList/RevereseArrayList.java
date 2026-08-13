package com.divyanshi.ArrayList;
import java.util.*;
public class RevereseArrayList {
    static void reverseArrayList(ArrayList<Integer> list){

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Original list" + list);
        reverseArrayList(list);
        System.out.println("Reversed list" + list);

    }
}
