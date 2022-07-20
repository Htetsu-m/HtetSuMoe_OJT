package com.java.fourth;

class B {

    protected String msg = "Try to access the protected variable outside the class within the package";

}

public class ProtectedExample {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        B b = new B();
        System.out.println(b.msg);
    }

}
