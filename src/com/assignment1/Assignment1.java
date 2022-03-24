package com.assignment1;
import java.io.File;
import java.util.Scanner;

public class Assignment1 {

    private void findFileFolder()
    {

        File file = new File("/home/abdua/");
        String fileName ;
        Scanner scanner = new Scanner(System.in);
        do{
            boolean found = false;
            System.out.println("ENTER THE NAME OF FILE");
            fileName =scanner.nextLine();
            String[] files = file.list();
            for (String fileVariable : files){
                Boolean mathchFile = fileName.equals(fileVariable);
                if (mathchFile){
                    found = true;
                    System.out.println("File Found : ");
                    System.out.println(fileVariable);
                    System.out.println("Path : "+ file.getAbsolutePath());
                }
            }

            if(!found)
            {
                System.out.println("File not find : Reenter the name of the file.");
            }
        } while(true);
    }

    //declared main()
    public static void main(String[] args){
        Assignment1 obj =new Assignment1();
        obj.findFileFolder();
    }
}