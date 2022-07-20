package com.java.fourth;

class A {

    String msg = "Try to access the default variable outside the class within the package";

}

public class DefaultExample {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        A a = new A();
        System.out.println(a.msg);
    }

}
