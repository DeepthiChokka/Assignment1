package com.assignment.programs;

public class Program14 {
    public static void main(String args[]) {
        try {

            if(Integer.parseInt(args[0])==1 || Integer.parseInt(args[0])==0){
                System.out.println(args[0] +" is neither prime nor composite");
            }

            else if(Integer.parseInt(args[0])==2)
                System.out.println(args[0] + " is a prime number");

            else {

                for (int i = 2; i < Integer.parseInt(args[0]) / 2; i++) {
                    if (Integer.parseInt(args[0]) % i == 0) {
                        System.out.println(args[0] + " is not a prime number");
                    } else {
                        System.out.println(args[0] + " is a prime number");
                    }
                    break;
                }
            }

        } catch (Exception e) {
            System.out.println("Please enter an integer number");
        }
    }
}
