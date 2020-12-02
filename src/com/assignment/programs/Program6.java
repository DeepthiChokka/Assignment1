package com.assignment.programs;
import java.util.*;

public class Program6 {
    public static void main(String args[]) {
        try {
            if (args[0].equalsIgnoreCase("female") && (Integer.parseInt(args[1]) >= 1 && Integer.parseInt(args[1]) <= 58)) {
                System.out.println("Interest= 8.2%");
            } else if (args[0].equalsIgnoreCase("female") && (Integer.parseInt(args[1]) >= 59 && Integer.parseInt(args[1]) <= 120)) {
                System.out.println("Interest= 7.6%");
            } else if (args[0].equalsIgnoreCase("male") && (Integer.parseInt(args[1]) >= 1 && Integer.parseInt(args[1]) <= 60)) {
                System.out.println("Interest= 9.2%");
            } else if (args[0].equalsIgnoreCase("male") && (Integer.parseInt(args[1]) >= 61 && Integer.parseInt(args[1]) <= 120)) {
                System.out.println("Interest= 8.3%");
            }
        }
        catch(Exception e){
            System.out.println("Do kindly enter gender(in lowercase) and age as command line arguments");
            System.out.println(e);
        }
    }
}
