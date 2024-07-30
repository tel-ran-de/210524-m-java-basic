public class IfSwitchClass {
    public static void main(String[] args) {
        int num = 5;
//        if-else
//        if (num % 2 == 0) {
//            System.out.println("Even");
//        } else {
//            System.out.println("Odd");
//        }

        if (num >= 0 && num <= 10) {
            System.out.println("Yes");
        } else if (num > 100 && num < 120){
            System.out.println("No");
        } else {
            System.out.println("Ok");
        }
//        switch case
//        int res = num % 2;
//        switch (res) {
//            case 0:
//                System.out.println("Even");
//                break;
//            case 1:
//                System.out.println("Odd");
//                break;
//            default:
//                System.out.println("Unsupported value");
//        }
        String  res = num >= 0 && num <= 10 ? "true" : "false";
        switch (res) {
            case "true":
                System.out.println("Even");
                break;
            case "false":
                System.out.println("Odd");
                break;
            default:
                System.out.println("Unsupported value");
        }
    }
}
