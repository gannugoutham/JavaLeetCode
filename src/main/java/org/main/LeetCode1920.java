package org.main;

public class LeetCode1920 {
    public int[] resultArray(int[] arr){
        int[] result = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            result[i] = arr[arr[i]];
        }
        for(int i: result){
            System.out.println("result "+ i);
        }
        return result;
    }
    public static void main(String[] args){
        LeetCode1920 obj = new LeetCode1920();
        int[] arr = {5,0,1,2,3,4};
        obj.resultArray(arr);
    }
}
