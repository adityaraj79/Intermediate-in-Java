package com.basicsinjava;

class Student{
    String name;
    int age;
    
         // Polymorphism (in this we can define more than one function with same name and use them as per our need)
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name+" "+age);
    }
}

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aman";
        s1.age = 22;
      
      
        // s1.printInfo(s1.age);
        //  output: 22
        s1.printInfo(s1.name, s1.age);
           //output: Aman 22
    }
}
