package org.main;

public class Leetcode1470 {
    public int[] shuffle(int[] nums, int n) {
        int result[] = new int[2*n];
        for(int i=0; i<n; i++){
            result[2*i] = nums[i];
            result[2*i+1] = nums[n+i];
        }
        for(int i: result){
            System.out.print(i);
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println("started..");
        Leetcode1470 obj = new Leetcode1470();
        int nums[] = {1,2,3,4,5,6,7,8,9,10};
        int n = nums.length/2;
        obj.shuffle(nums,n);
    }
}
