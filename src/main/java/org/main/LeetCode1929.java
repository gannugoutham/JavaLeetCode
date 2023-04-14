package org.main;

public class LeetCode1929 {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        int index = 0;
        for(int i: nums){
            ans[index] = ans[index+nums.length] = i;
            index++;
        }
        for(int i: ans){
            System.out.println("ans "+ i);
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.println("started..");
        LeetCode1929 obj = new LeetCode1929();
        int arr[] = {1,3,2,1};
        obj.getConcatenation(arr);
    }
}
