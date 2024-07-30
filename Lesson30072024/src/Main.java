import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int day = 5;
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Unsupported day");
        }

//        System.out.println("Before return from if");
//        if(true) {
//            return;
//        }
//        System.out.println("After return. Never works for if(true)");
//        System.out.println(returnNum());
    }

//    public static int returnNum(){
//        System.out.println("Before return");
//        return new Random().nextInt(10);
        // is not working
//        System.out.println("After return");
//        int i = 0;
//        if(true){}
//    }
}