class Solution {
    public int minimumSwaps(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 0;
        
       
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                k++;
            }
        }
        
        int count = nums.length - k;
        int swap = 0;
        
      
        for (int i = 0; i < count; i++) {
            if (nums[i] == 0) {
                swap++;
            }
        }

        return swap;
    }
}