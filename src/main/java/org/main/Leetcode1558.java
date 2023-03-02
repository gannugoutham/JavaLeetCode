package org.main;

import java.util.Arrays;

public class Leetcode1558 {
    private int[] arr;
//constructor
    public Leetcode1558(int[] array) {
        this.arr = array;
    }
    public void minCount() {
        int arrLength = arr.length, addCount = 0, mulCount = 0;
        for(int i=0; i<arrLength; i++) {
            int currMul = 0;
            while(arr[i]>0) {
                if(arr[i]%2 !=0 ) {
                    arr[i]--;
                    addCount++;
                } else {
                    arr[i] /= 2;
                    currMul++;
                }
            }
            mulCount = Math.max(mulCount, currMul);
        }
        System.out.println(addCount + mulCount);
    }
}
