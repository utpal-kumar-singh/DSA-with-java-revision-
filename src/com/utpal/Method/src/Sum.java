import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
       // sum();
       // subtract();
       // int  ans =sum2();
       // System.out.println(ans);

        int ans =sum3(20,30);
        System.out.println(ans);

        /*you can see , sum(),subtract() both are method .
        we can call this function /method  multiple  of times  .
        calling a method means ,getting  a return type from a method .


        return type =(method  finished ,after complete execution ,you will get
        a value such as sum of two number ,subtraction of two number)
        */
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first  number:");
        int num1 = in.nextInt();
        System.out.println("Enter second  number:");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("sum is = " +sum);}

    static void subtract(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first  number:");
        int num1 = in.nextInt();
        System.out.println("Enter second  number:");
        int num2 = in.nextInt();
        int subtract = num1 - num2;
        System.out.println("subtraction  is = " +subtract);}

    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first  number:");
        int num1 = in.nextInt();
        System.out.println("Enter second  number:");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }
/*this is how you can get arguments instead of using scanner ,you can directly
pass parameters , you just need to declare the data type before applying any operation
 */
    static int  sum3(int a,int b)
    {
        int sum = a+b;
        return  sum;
    }



}
