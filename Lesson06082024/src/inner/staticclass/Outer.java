package inner.staticclass;

public class Outer {
    private static void outerMethod()
    {
        // Print statement
        System.out.println("inside outerMethod");
    }

    // Class 2
    // Static inner class
    static class Inner {

        public static void display()
        {
            // Print statement
            System.out.println("inside inner class Method");

            // Calling method inside main() method
            outerMethod();
        }
    }
}
