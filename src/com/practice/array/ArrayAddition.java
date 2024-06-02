package com.practice.array;

public class ArrayAddition {
    public static void main(String[] args) {
        int[] array_data=new int[5];
        array_data[0]=1;
        array_data[1]=4;
        array_data[2]=15;
        array_data[3]=14;
        array_data[4]=2;

        int sum_Of_array_data=0;
        for (int arrayDatum : array_data) {

            sum_Of_array_data += arrayDatum;
        }
        System.out.println("SumofArray="+sum_Of_array_data);
    }


}
