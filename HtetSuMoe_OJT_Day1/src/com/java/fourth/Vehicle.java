package com.java.fourth;

abstract class Vehicle {
    abstract void bike();  

}
class Honda extends Vehicle{
    @Override  
    void bike() {  
        System.out.println("Bike is running");  
      
    }  
}

