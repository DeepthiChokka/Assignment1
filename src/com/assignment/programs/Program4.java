package com.assignment.programs;

public class Program4 {
    public static void main(String args[]) {
    char firstval='v',secondval='t';
    int compare=Character.compare(firstval,secondval);
    if(compare>0){
        System.out.println(secondval+","+firstval);
    }
    else if(compare<0){
        System.out.println(firstval+","+secondval);
    }
    else{
        System.out.println("Both the values are equal");
    }

    }
}
