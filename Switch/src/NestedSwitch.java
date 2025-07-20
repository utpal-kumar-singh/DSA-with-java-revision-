import java.util.Scanner;

public class NestedSwitch {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("PLZ enter your  emp id");

        int EmpId = in.nextInt();
        System.out.println("PLZ enter your  department");
        String  Department =  in.next();

//        switch (EmpId){
//            case 1:
//                System.out.println("utpal");
//                break;
//            case 2:
//                System.out.println("pratyush");
//                break;
//            case 3:
//                System.out.println("aditya");
//                break;
//            case  4:
//                //
//                switch (Department){
//                    case "iT":
//                        System.out.println("IT department");
//                        break;
//                    case "Management":
//                        System.out.println("Management department");
//                        break;
//                    default:
//                        System.out.println("not entered  any  department");
//
//                }
//
//    break;
//            default:
//                System.out.println("not valid  emp id");
//        }

// better  after  enhanced nested switch :-
        switch (EmpId) {
            case 1 -> System.out.println("utpal");
            case 2 -> System.out.println("pratyush");
            case 3 -> System.out.println("aditya");
            case 4 -> {
                System.out.println("Enter your  department");
                switch (Department) {
                    case "iT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("not entered  any  department");
                }
            }
            default -> System.out.println("not valid  emp id");
        }
    }
}
