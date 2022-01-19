package com.basicsinjava;

import java.util.Scanner;

public class Main {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};

        //time complexity = O(n^2)     (which is not a good time complexity)
        //Insertion sort
        for(int i =1; i<arr.length ; i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }

            //placement
            arr[j+1] = current;
        }
        printArray(arr);
    }
}
