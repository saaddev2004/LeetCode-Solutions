import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j = nums.length-1;
        int b= nums.length;
        int[] result = new int[b];

        while(i<=j){
            int p = nums[i]*nums[i];
            int q = nums[j]*nums[j];
            if(p>=q){
                result[b-1] = p;
                i++;
                b--;
            } 
            else{
                result[b-1] = q;
                j--;
                b--;
            }
        } 
        return result;

    }
}