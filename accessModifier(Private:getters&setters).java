package com.basicsinjava;

class Account{
    public String name;
    protected String eMail;
    private String password;        //private keyword is used for Private Access Modifiers.We can access this only in the current class, 

        //getters and setters                           //to access this in a subclass we have to import Two functions :Getters & Setters. 
        public String getPassword(){
            return this.password;
        }
        public void setPassword(String pass){
            this.password = pass ;
        }
}                                           
public class Bank {
    public static void main(String args[]){
        Account account1 = new Account();
        account1.name = "Apna College";
        account1.eMail = "apnacollege@gmail.com";
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());
    }
}
