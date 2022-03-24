package com.assignment11;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Assignment11Map {
    public static void main(String[] args) {
        System.out.println("This is CLA: " + args[0]);
        ArrayList<Character> arrayList = new ArrayList<>();
        for (char i : args[0].toCharArray()) {
            arrayList.add(i);
        }

        var mappedOutput = arrayList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        try {

            PrintWriter printWriter = new PrintWriter("new_file");
            printWriter.println(mappedOutput);
            printWriter.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        System.out.println(mappedOutput);


    }
}
