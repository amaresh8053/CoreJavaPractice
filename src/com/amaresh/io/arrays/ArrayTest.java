package com.amaresh.io.arrays;

public class ArrayTest {

   //Input array   =  [0, 1, 0, 1, 0, 0, 1, 1, 1, 0]


    //Sort an array of 0s, 1s and 2s
    public int[] sortArrayOf0and1(int[] inputArr){

        int zeroCount=0;
        int size=inputArr.length;

        for (int i=0;i<size;i++){
            if(inputArr[i]==0){
                zeroCount=zeroCount+1;
            }
        }
        for (int i=0;i<zeroCount;i++){
            inputArr[i]=0;
        }
        for (int i=zeroCount;i<size;i++){
            inputArr[i]=1;
        }

        return inputArr;
    }


}
