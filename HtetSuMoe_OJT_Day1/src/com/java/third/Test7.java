package com.java.third;

public class Test7 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Java Ternary Operator");
        System.out.println("------------------------");
        
        int februaryDays = 29;
        String result;

        // ternary operator
        result = (februaryDays == 28) ? "Not a leap year" : "Leap year";
        System.out.println(result);
    }

}
