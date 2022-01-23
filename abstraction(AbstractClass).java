package com.basicsinjava;

abstract class Animal {
    abstract void walk();
    public void eat(){

    }
}
class Horse extends Animal{
    public void walk(){
        System.out.println("Walk on four Legs.");
    }
}
class Chicken extends Animal{
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
