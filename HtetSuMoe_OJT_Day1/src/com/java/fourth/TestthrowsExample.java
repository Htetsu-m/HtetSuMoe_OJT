package com.java.fourth;

import java.io.IOException;

public class TestthrowsExample {
    void m() throws IOException {
        throw new IOException("device error");// checked exception
    }

    void n() throws IOException {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TestthrowsExample obj = new TestthrowsExample();
        obj.p();
        System.out.println("normal flow...");
    }

}
