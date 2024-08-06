package inner.nestedclasse;

public class InnerClass {
    public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner();
        in.show();

        Outer outer = new Outer();
        outer.outerMethod();
    }
}
