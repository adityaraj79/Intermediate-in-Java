package com.basicsinjava;

class Account{
    public String name;          //public keyword is for public Access Modifiers.
}                                //if we use this as a access modifier then anyone can access this in this Class or in other Packages.

public class Bank {
    public static void main(String args[]){
        Account account1 = new Account();
        account1.name = "Apna College";
    }
}
