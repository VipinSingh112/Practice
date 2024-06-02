package com.practice.array;
//Eleement Present In Array or Not
public class ElementPresentINArrayOrNot {
    public static void main(String[] args) {
        targetNumber(32);
    }
    public static void targetNumber(int num){
        int[] array_of_num={21,34,233423,32,323,23};
        int firstNumber=num;
        int secondNumber=0;
        for (int j : array_of_num) {

            if (firstNumber == j) {
                System.out.println("Number Found In Array");
                break;
            } else {
                System.out.println("Number Not Found In Array");
            }
        }
    }
}
