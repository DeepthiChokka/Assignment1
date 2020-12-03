package com.assignment.collections;

import java.util.ArrayList;

public class ArrayListMethods {

    ArrayList<Integer> A1 = new ArrayList<Integer>();
    ArrayList<Integer> A2 = new ArrayList<Integer>();

    public ArrayList<Integer> saveEvenNumbers(int N){
        for(int i=2; i<=N; i=i+2){
            A1.add(i);
        }
        return A1;
    }

    public ArrayList<Integer> printEvenNumbers(ArrayList<Integer> A1){
        for(int i=0;i< A1.size();i++){
            A2.add(A1.get(i) * 2);
        }
        return A2;
    }

    public int printEvenNumber(int N){
        for(int i=0;i< A1.size();i++){
            if(A1.get(i)==N) {
                return N;
            }

        }
        return 0;
    }

    public void print(ArrayList<Integer> A1){
        for(int i=0;i<A1.size();i++){
            System.out.println(A1.get(i));
        }

    }
}
