package inner.nestedclasse;

public class Outer {
    void outerMethod() {
        System.out.println("inside outerMethod");
    }

    class Inner {
        public void show() {
            System.out.println("In a nested class method");
        }
    }
}
