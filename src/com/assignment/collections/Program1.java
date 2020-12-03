package com.assignment.collections;

import java.util.ArrayList;

public class Program1 {
    public static void main(String args[]){
        ArrayListMethods alm=new ArrayListMethods();
        ArrayList<Integer> sample=new ArrayList<Integer>();

        sample=alm.saveEvenNumbers(20);

        ArrayList<Integer> sampleval=alm.printEvenNumbers(sample);
        alm.print(sampleval);

        int val=alm.printEvenNumber(10);
        System.out.println("The value found? "+val);


    }
}
