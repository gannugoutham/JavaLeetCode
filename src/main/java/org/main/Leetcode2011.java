package org.main;

public class Leetcode2011 {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for(int i=0; i<operations.length; i++){
            if((operations[i] == "++X") || (operations[i] == "X++")){
                result+=1;
            }
            else if((operations[i] == "--X") || (operations[i] == "X--")){
                result-=1;
            }
        }
        System.out.println("result "+ result);
        return result;
    }
    public static void main(String[] args){
        System.out.println("started..");
        Leetcode2011 obj = new Leetcode2011();
        String nums[] = {"--X", "X++", "X++"};
        obj.finalValueAfterOperations(nums);
    }
}
