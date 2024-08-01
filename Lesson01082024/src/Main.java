public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 2; i < 10; i++) {
            System.out.print("2 * " + i + " = " + (2*i));
            System.out.println();
        }
    }
}