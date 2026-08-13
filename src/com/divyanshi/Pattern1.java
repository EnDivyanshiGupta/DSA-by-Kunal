package com.divyanshi;

public class Pattern1 {
    public static void main(String[] args) {
 //       int n = 4;
//        for(int i =1; i<=n; i++){
//            for(int j = 1; j<=n; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //Print solid rectangular pattern.
        int n =3;
        for(int row =1; row<=n; row++){
            for(int col = 1; col<=5; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
