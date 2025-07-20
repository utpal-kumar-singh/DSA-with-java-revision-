import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in =  new  Scanner(System.in);
        String fruit = in.next();
//        switch (fruit){
//            case "mango":
//                System.out.println("king of fruit");
//                break;
//            case "grapes":
//                System.out.println("a green fruit");
//                break;
//            case "Apple":
//                System.out.println("a sweet red apple");
//                break;
//            case "banana":
//                System.out.println("yummy fruit");
//                break;
//            default:
//                System.out.println("plz enter a valid fruit");
// in above  old switch syntax  are  used, but below  there is  a new  enhanced switch statement
        switch (fruit) {
            case "mango" -> System.out.println("king of fruit");
            case "grapes" -> System.out.println("a green fruit");
            case "Apple" -> System.out.println("a sweet red apple");
            case "banana" -> System.out.println("yummy fruit");
            default -> System.out.println("plz enter a valid fruit");
        }
    }
}