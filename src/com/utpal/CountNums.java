package com.utpal;

public class CountNums {
    public static void main(String[] args) {

        //here you can count how many  number of  time it repeat
        int n = 458288855;
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 8) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);

    }
}
