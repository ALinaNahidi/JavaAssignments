package com.assignment8;

public class Assignment8ErrorHandling {
    public static void main(String[] args) {
        Account account = new Account();
//        String str=null;
        String str = "abc";
        try {
            account.deposit(50);
            account.withdraw(100);
            System.out.println(str.length());
        }catch (IllegalArgumentException
                | InsufficientFundsException
                | NullPointerException e){
            System.out.println(e);
        }finally {
            System.out.println("Execute Finally Block");
        }


    }
}
