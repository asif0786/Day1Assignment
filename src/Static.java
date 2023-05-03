//1.6 Write a program to demonstrate static variables, methods, and blocks.

public class Static {
    //Static Variables
    static int a = 3;
    static int b;

    //Static Method
    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    //Static Block
    static {
        System.out.println("Static block initialized.");
        b = a * 4;
    }

    public static void main(String args[]) {
        meth(42);
    }
}
