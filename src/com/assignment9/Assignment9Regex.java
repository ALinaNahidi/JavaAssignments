package com.assignment9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment9Regex {
    public static void main(String[] args) {
       String input = "A.";
        Pattern pattern = Pattern.compile("^[A-Z]\\.$");
        Matcher matcher = pattern.matcher(input);
        System.out.println(matcher.matches());
    }
}
