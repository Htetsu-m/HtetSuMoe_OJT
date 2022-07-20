package com.java.fourth;

class Employee {
    int id;
    String name;
    long salary;

    public Employee(int id, String name, long salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

}

class TestClassExample {
    public static void main(String[] args) {

        Employee e = new Employee(1, "John William", 25000);

        System.out.println(e.id + " " + e.name + " " + e.salary);
        
        Employee e1 = new Employee(2, "Mya Mya", 35000);

        System.out.println(e1.id + " " + e1.name + " " + e1.salary);

    }
}
