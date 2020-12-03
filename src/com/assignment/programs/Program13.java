package com.assignment.programs;

public class Program13 {
    public static void main(String args[]){

        for (int i = 11; i < 99; i++)
        {
            int count=0;
            for(int j=i/2;j>1;j--)
            {
                if (i % j== 0) {
                    count++;
                }
            }
            if(count==0){
                System.out.println(i);
            }
        }
    }
}
