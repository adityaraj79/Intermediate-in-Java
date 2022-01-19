package com.basicsinjava;

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aditya Raj";
        s1.age = 18;
        Student s2 = new Student();
        s2.name = "Tony Stark";
        s2.age = 20;

        s1.printInfo();
        s2.printInfo();
    }
}
