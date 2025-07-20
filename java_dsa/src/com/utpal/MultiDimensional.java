package com.utpal;

import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {
        /*
        let any matrix of any order 3*3

        1 2 3
        4 5 6
        7 8 9

         */

//        int [] [] arr = new int[3][];
//        int[][] arr2D = {
//                {1,2,3},//0TH INDEX
//                {4,5,6},//1ST INDEX
//                {7,8,9}//2ND INDEX
//
//
//
  //      };

        //input for 2d arrays
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length);
        for (int row = 0;row < arr.length;row++)
        {
            for (int col=0;col<arr[row].length;col++)
            {
                arr[row][col]= in.nextInt();
            }

        }

        //output
        for (int row = 0;row < arr.length;row++)
        {
            for (int col=0;col<arr[row].length;col++)
            {
                System.out.println(arr[row][col] + "  ");
            }
            System.out.println();
        }


    }
}
