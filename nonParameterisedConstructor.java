package com.basicsinjava;

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    
    // Non parameterised Constructor
    Student(){
        System.out.println("Constructor called");
    }
}

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aditya Raj";
        s1.age = 18;
        
        s1.printInfo();
    }
}
