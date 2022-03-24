package com.assignment2;

public class Assignment2 {
    public static void main(String[] args) {
        String string="abcdefghijklmnopqrstuvwxyz";
        var c =string.toLowerCase()
                .chars()
                .filter(alpha-> alpha>='a' && alpha<='z')
                .distinct()
                .count();
        if(c==26){
            System.out.println(true);
        }
        else System.out.println(false);
    }
}

//Complexity is O(n)
