package com.basicsinjava;

class Shape{
    String colour;
}
   // Inheritance (there will be no error in this code : the class triangle inherits the nature of class Shape,
class triangle extends Shape{                                   // using the key word extends. )

}

public class Main {
    public static void main(String[] args) {
        triangle t1 = new triangle();
        t1.colour = "red";
        System.out.println(t1.colour);
    }
}
