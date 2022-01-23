package com.basicsinjava;

interface Animal {
    public void walk();
    
}

interface Herbivore{

}
class Horse implements Animal,Herbivore{
    public void walk(){
        System.out.println("Walk on four Legs.");        //Multiple inheritance is not through Class, it is through interfaces.
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
