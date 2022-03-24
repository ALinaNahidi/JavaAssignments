package com.assignment3;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Scanner;
public class Assignment3 {

    public static void runSystemCommand(String command) {

        try {
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));

            String data = "";
                while ((data = inputStream.readLine()) != null) {
                System.out.println(data);
                }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        String ipAddress;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ip address : ");
        ipAddress =scanner.nextLine();
        runSystemCommand("ping " + ipAddress);


    }
}


