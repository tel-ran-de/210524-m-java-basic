public class WhileClass {
    public static void main(String[] args) {
//        int i = 10;
//        while (i > 0) {
//            System.out.println(i);
//            i++;
//            i--;
//        }
//        System.out.println(i);

        int i = 2;
        while (true) {
            if (i < 5) {
                System.out.println("JAVA " + i);
                i++;
            } else {
                break;
            }
        }

        for (int idx = 0; idx < 10; idx++) {
            System.out.println("JAVA");
        }
    }
}
