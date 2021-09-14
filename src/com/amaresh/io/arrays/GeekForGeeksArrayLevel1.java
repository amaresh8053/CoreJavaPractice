package com.amaresh.io.arrays;

//https://www.geeksforgeeks.org/top-50-array-coding-problems-for-interviews/
public class GeekForGeeksArrayLevel1 {

    //Q1 Check if a key is present in every segment of size k in an array
    public  String checkSegment(int[] arr,int key,int segmentSize){
        String result="no";
        int lastSegmentSize=arr.length%segmentSize;
        int noOfSegments=arr.length/segmentSize;

        for(int i=0;i<arr.length-lastSegmentSize;i=i+segmentSize){
            for(int j=0;j<segmentSize;j++){
                if(arr[j+i]==key){
                    result="yes";
                }
            }
        }
        //for last segment
        if(lastSegmentSize!=0){
            String lastResult="no";
            int lastSegmentStartingIndex=arr.length-lastSegmentSize;
            for(int k=lastSegmentStartingIndex;k<arr.length;k++){
                if(arr[k]==key){
                    lastResult="yes";
                }
            }
            result=lastResult;
        }
        return result;
    }


    //Program to find the minimum (or maximum) element of an array
    public String findMaxAndMin(int[] arr){
        int min=arr[0];
        int max=arr[0];

        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return "Min--"+min+"---Max-----"+max;
    }

    //Write a program to reverse an array or string
    public int[] reverseArray(int[] arr){
        int mid=arr.length/2;
        int l=0,r=arr.length-1;

        while (!(l==mid)){
            arr[l]=arr[l]+arr[r];
            arr[r]=arr[l]-arr[r];
            arr[l]=arr[l]-arr[r];
            l++;
            r--;
        }
        return arr;
    }

    //sort an array in ascending order
    public int[] sortAnArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    arr[i]=arr[i]+arr[j];
                    arr[j]=arr[i]-arr[j];
                    arr[i]=arr[i]-arr[j];

                }
            }
        }
        return arr;
    }

    //Find closest number in array
    //{1, 2, 4, 5, 6, 6, 8, 9};
    public int findClosest(int[] arr,int input){
        int output=arr[0];
        int temp=input-arr[0];
        for(int i=1;i<arr.length;i++){
            if(Math.abs(input-arr[i])<temp){
                output=arr[i];
                Math.abs(input-arr[i]);
            }
        }
        return output;
    }

}











