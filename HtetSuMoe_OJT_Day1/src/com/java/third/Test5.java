package com.java.third;

public class Test5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Unary Operators");
        System.out.println("---------------");
        System.out.println("Increment and Decrement Operators");
        System.out.println("---------------------------------");
        // declare variables
        int a = 12, b = 12;
        int result1, result2;

        // original value
        System.out.println("Value of a: " + a);

        // increment operator
        result1 = ++a;
        System.out.println("After increment: " + result1);

        System.out.println("Value of b: " + b);

        // decrement operator
        result2 = --b;
        System.out.println("After decrement: " + result2);
    }

}
