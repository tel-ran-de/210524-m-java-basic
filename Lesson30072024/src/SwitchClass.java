import java.util.Scanner;

public class SwitchClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose menu item(1, 2, 3):");
        int menuItem = sc.nextInt();

        switch (menuItem) {
            case 1:
                System.out.println("Choose operation:");
                break;
            case 2:
                System.out.println("History");
                break;
            case 3:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Unsupported operation");
        }
    }
}
