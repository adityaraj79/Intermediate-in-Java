package com.basicsinjava;

class Account{
    String name;                 //no any keyword is used for public Access Modifiers.
}                                //if we use this as a access modifier then anyone can access this in the same Packages.

public class Bank {
    public static void main(String args[]){
        Account account1 = new Account();
        account1.name = "Apna College";
    }
}
