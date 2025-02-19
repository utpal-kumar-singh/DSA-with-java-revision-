package com.utpal;

import java.util.Scanner;

public class Add_two_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two number");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("the sum of given integer is " + sum);
    }
}
