package com.amaresh.io.arrays;

public class ArraySearchAlgo {

    //using recursion
    public  int binarySearchRecursion(int[] inputArray, int l, int r, int inputNo) {
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (inputArray[mid] == inputNo) {
                return mid;
            } else if (inputArray[mid] < inputNo) {
                return binarySearchRecursion(inputArray, mid + 1, inputArray.length - 1, inputNo);
            } else {
                return binarySearchRecursion(inputArray, 0, mid - 1, inputNo);
            }
        }
        return -1;
    }

    //using non recursion
    public  int binarySearchNonRecursion(int[] inputArray, int l, int r, int inputNo) {
        while(l <= r) {
            int mid = l + (r - l) / 2;
            if (inputArray[mid] == inputNo) {
                return mid;
            } else if (inputArray[mid] < inputNo) {
                l=mid+1;
            } else {
                r=mid-1;
            }
        }
        return -1;
    }

}
