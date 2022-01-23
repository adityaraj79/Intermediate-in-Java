package com.basicsinjava;

interface Animal {
    public void walk();
    
}

class Horse implements Animal{
    public void walk(){
        System.out.println("Walk on four Legs.");
    }
}
class Chicken implements Animal{
    public void walk(){
        System.out.println("Walk on two Legs.");
    }
}
public class Oops{
    public static void main(String args[]){
        Horse h1 = new Horse();
        h1.walk();
    }
}
