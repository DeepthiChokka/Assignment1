package com.assignment.programs;

import java.util.Scanner;

public class Program15 {
    public static  void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = sc.nextInt();

        int sum=0,r;
        int n=number;

        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }

        System.out.println(number +"->" +sum);
    }
}
