package com.assignment.programs;

public class Program7 {
    public static void main(String args[]) {
        char value='D';
        if(Character.isLowerCase(value)==true){
            System.out.println(value +"->" +Character.toUpperCase(value));
        }
        else if(Character.isUpperCase(value)==true){
            System.out.println(value +"->" +Character.toLowerCase(value));
        }
        else {
            System.out.println("Enter a character");
        }
    }
}
