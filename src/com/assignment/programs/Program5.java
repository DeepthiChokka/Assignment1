package com.assignment.programs;

public class Program5 {
    public static void main(String args[]) {
        char value='d';
        if(Character.isAlphabetic(value)==true){
            System.out.println("Value is an alphabetic");
        }
        else if(Character.isDigit(value)==true){
            System.out.println("Value is a digit");
        }
        else {
            System.out.println("Value is a special character");
        }
    }
}
