package com.basicsinjava;

class Pen{
    String colour;
    String type;  //ball,point,gel

    public void write(){
        System.out.println("Writing Something");
    }
    public void printColour(){
        System.out.println(this.colour);
    }
}

public class Main {

    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.colour = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.colour = "black";
        pen2.type = "point";

        pen1.printColour();
        pen2.printColour();
    }
}
