package com.basicsinjava;

class Student{
    String name;                      //when we use the key word static(with a function), then we can access it with the name of it's Class.
    static String school;
}
public class Oops{
    public static void main(String args[]){          //Here we do not need to write: Student s1 = new Student();
        Student.school = "JMV";                                                 //   s1.school("JMV");
    }                                                //here we have direct access the school with name of it's class Student.
}
