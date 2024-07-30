public class TernarnyClass {
    public static void main(String[] args) {
        int num = 2;
        String res = "";

        if (num % 2 == 0) {
            res = "Even";
        } else {
            res = "Odd";
        }
        System.out.println(res);
//        if => num % 2 == 0 ? "Even"
//        else => : "Odd"
//                          1               2       3
        String ternRes = num % 2 == 0 ? "Even" : "Odd";
//        String ternRes = num % 2 == 0 ? num > 100 ? "Even" : "Odd" : "Ok";
//        String ternRes1 = num % 2 == 0 ? "Ok" : num > 100 ? "Even" : "Odd";
        System.out.println(ternRes);

    }
}
