public class StringExample {

    public static void main(String[] args) {

      //  String message = greet();
       // System.out.println(message);
        String yourmessage = greet2("utpal singh");
        System.out.println(yourmessage);
    }

     static String greet2(String name) {
   String message = "hello " + name;
   return message;

    }

    static String  greet()
    {
String  greeting;
        greeting = "how are you ?";
        return greeting;
    }


}
