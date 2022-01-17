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
        //Bubble sort
        for(int i = 0; i<arr.length -1; i++){
            for(int j=0; j<arr.length-i-1; j++){

                //Swap
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printArray(arr);
    }
}
