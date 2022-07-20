package com.java.third;

public class Test4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Logical Operators");
        System.out.println("-----------------");
        
        // && operator
        System.out.print("(5 > 3) && (8 > 5) : ");
        System.out.println((5 > 3) && (8 > 5));
        System.out.print("(5 > 3) && (8 < 5) : ");
        System.out.println((5 > 3) && (8 < 5));

        // || operator
        System.out.print("(5 < 3) || (8 > 5) : ");
        System.out.println((5 < 3) || (8 > 5));
        
        System.out.print("(5 > 3) || (8 < 5) : ");
        System.out.println((5 > 3) || (8 < 5));
        
        System.out.print("(5 < 3) || (8 < 5) : ");
        System.out.println((5 < 3) || (8 < 5));

        // ! operator
        System.out.print("!(5 == 3) : ");
        System.out.println(!(5 == 3));
        
        System.out.print("!(5 > 3) : ");
        System.out.println(!(5 > 3));
    }

}
