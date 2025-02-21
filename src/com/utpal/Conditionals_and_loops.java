package com.utpal;

import java.util.Scanner;

public class Conditionals_and_loops {

    public static void main(String[] args) {
        /* syntax of  if statement:-
         * if  (boolean expression true or false)
         * {   //body
         * }
         * else
         * {  // do this
         * }
         *  */
//        int salary = 30000;
//        if  (salary>24000)
//        {  salary = salary +6000; }
//        else {salary = salary+3000; }
//        System.out.println(salary);

        /*if else_if syntax(for multiple if else)
         * if (condition)
         * {do this} else if(condition)
         * {do this one}else if (condition)
         * {do this one}else  if (condition)
         * {do this}else
         * {above all the condition gives false the do this  one}
         * */
    // use of  different   (bitwise) operator in if  else  condition:-( we  will do  it inn detail
        Scanner in = new Scanner(System.in);

        int  a = in.nextInt();  // both condition should  be  true  otherwise  it will execute  else part
        int b  = in.nextInt();
//        if (a==10  && b==20){
//
//            System.out.println("hello world");
//        }else {
//            System.out.println("hey");
//        }


        if (a==10  || b==20){

            System.out.println("hello world");  //At  least one  of the condition should  be true otherwise it will execute  else part
        }else {
            System.out.println("hey");
        }
    }
}
