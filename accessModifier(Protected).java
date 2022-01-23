package com.basicsinjava;

class Account{
    public String name;
    protected String eMail;                 //protected keyword is used for protected Access Modifiers.
}                                           //if we use this as a access modifier then anyone can access this in the current Packages but for another package only 
                                                                                                       //subclasses can access it.

public class Bank {
    public static void main(String args[]){
        Account account1 = new Account();
        account1.name = "Apna College";
        account1.eMail = "apnacollege@gmail.com";
    }
}
