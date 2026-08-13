package com.divyanshi.ArrayList;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        //wrapper class
//        Integer i = Integer.valueOf(4);
//        System.out.println(i);
//
//        Float f = Float.valueOf(2.43f);
//        System.out.println(f);

        //ArrayList
        ArrayList<Integer> l1 = new ArrayList<>();

        //add new element
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        //get an element at index i
        System.out.println(l1.get(1)); //o/p->3

        //print with for loop.
        for(int i=0; i<l1.size(); i++){
            System.out.println(l1.get(i) + " ");   //o/p -> [2,3,4,5]
        }

        //printing the ArrayList directly
        System.out.println(l1);     //o/p -> [2,3,4,5]

        //adding element at some index i
        l1.add(2,100);
        System.out.println(l1);  //o/p -> [2,3,100,4,5]

        //modifying element at index i
        l1.set(2,10);
        System.out.println(l1);

        //removing an element at index i
        l1.remove(2);
        System.out.println(l1);

        //removing an element e
        l1.remove(Integer.valueOf(4));
        System.out.println(l1);  // o/p-> [2,3,5]

        //checking if an element exists
        boolean ans = l1.contains(Integer.valueOf(5));
        System.out.println(ans);

        //if you don't specify class, you can put anything inside l.
        ArrayList l = new ArrayList();
        l.add("buddhu");
        l.add(true);
        l.add(22);
        System.out.println(l);

    }
}
