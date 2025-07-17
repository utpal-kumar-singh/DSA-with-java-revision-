package com.utpal.Arrays;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        int[]  arr  = new  int[5];
        Scanner in = new Scanner(System.in);
        arr[0] = 23;
        arr[1] = 28;
        arr[2] = 36;
        arr[3] = 47;
        arr[4] = 49;

       // System.out.println(arr[3]);

        // input using loops;-

        for (int  i =0;i < arr.length;i++){

            arr[i]= in.nextInt();


        }

        //here we have  different way to print an element of an array
        System.out.println(Arrays.toString(arr));
//        for (int j : arr) {
//            System.out.print(j + "   ");
//        }

//        for (int num : arr) { //for every element of array, print the element
//            System.out.print(num + "   ");// here num represent element of the array
  //      }

     //   System.out.println(arr[5]);//index out of bound error



    }
}
