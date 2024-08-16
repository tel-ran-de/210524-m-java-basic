package org.example;

public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int res;
        try {
            res = num1 / 0;
            System.out.println("Ok");
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Finally");
        }
    }
}