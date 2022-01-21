package com.basicsinjava;

class Shape{
    public void area(){
        System.out.println("displays area");
    }
}

class triangle extends Shape{
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println(22/7*r*r);
    }
}

class equilateralTriangle extends triangle{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}

public class Main {
    public static void main(String[] args) {
    }
}
