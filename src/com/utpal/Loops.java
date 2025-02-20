package com.utpal;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /* syntax of for  loop:-

        for(initialization;condition;increment/decrement )
         {  body
          }

         */
        //Q. print 1 to 5
//        for (int num=1;num<=5;num+=1){
//           System.out.println(num);
//       }

        // Q. print 1  to n
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the value of  n ?");
//        int n = in.nextInt();
//
//        for (int num =1;num<=n;num++){
//            System.out.println(num + "  ");
//        }

        // syntax of  while  loop:-
        /*
               i=1--> initialization
        while(condition){
               body
               i++ --> increment
        }

         */
        //Q. print 1 to 5 :-
//
        // syntax  o  do  while  loop:- (atleast one time executed  and  then its  depend  upon  condition)

//         initialization
//        do {
//           // body
//            increment
//        }  while (condition);
 //  Q.print 1 to 6:-
        int num = 1;
        do {
            System.out.println(num);
            num++;
        }
        while (num<=6);
    }

}
