package com.utpal;

import java.util.Scanner;

public class Case_checker {
    public static void main(String[] args) {
        Scanner in  =  new Scanner(System.in);
       // System.out.println(in.next());
        char ch = in.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }

        // here you will  not  get  anny  string after  first one because  it will  allow upto    spaces
        //  so  here  we  will  use trim() to  get string  after    extra  space
        //The method charAt(0) is used to get the first character of a string.
       // System.out.println(in.next().trim());
      //  System.out.println(in.next().trim().charAt(1));
    }
}
