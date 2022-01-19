package com.basicsinjava;

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Parameterised Constructor
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Aman", 22);

        s1.printInfo();
    }
}
