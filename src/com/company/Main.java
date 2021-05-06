package com.company;

public class Main {

    public static int minValue(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min){
                int temp = array[i];
                array[i]=min;
                min = temp;
            }
        }
        return min;
    }
    public static void main(String[] args) {
	// write your code here
        int arr[] = {3,5,7,9,2,6,1};
        int index = minValue(arr);
        System.out.println("GTNN : "+ index);
    }
}
