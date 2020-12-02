package com.assignment.programs;

public class Program3
{
    public static void main(String args[]){
        if(args.length==0){
            System.out.println("No values");
        }
        else if(args.length>0){
            for(int i = 0; i<args.length-1; i++) {
                System.out.print(args[i] + ",");
            }
            System.out.println(args[args.length-1]);
        }
    }
}
