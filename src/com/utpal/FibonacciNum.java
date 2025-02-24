package com.utpal;

import java.util.Scanner;

public class FibonacciNum {
    public static void main(String[] args) {
        System.out.println("Enter  the  value  of  n for  which you want your  fibonacci number ?");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;

        }
        System.out.println("your  fibonacci number is  = " + b);

    }
}
