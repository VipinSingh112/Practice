package com.practice.array;

public class AverageMarksOfArray {
    public static void main(String[] args) {
        int[] obtainMarks = {10,20,20,30,40};
int averageMarks=averageMarks(obtainMarks);
        System.out.println("Average Marks of Array is: " + averageMarks);
    }
    public static int averageMarks(int[] arr) {
        int averageMarks = 0;
        int sumOfArray = 0;
        for(int i=0;i< arr.length;i++){
        sumOfArray += arr[i];
        }
        System.out.println(arr.length);
        averageMarks=sumOfArray/arr.length;
        return averageMarks;
    }

}
