class Solution {
    public boolean isPalindrome(int x) {
        int reverse = 0;
        int original = x;
        while(x!=0){
            if(x<0){
                return false;
            }
            int l = x % 10;
            reverse = reverse * 10 + l;
            x=x/10;

        }
        if(reverse == original){
            return true;
        }

        return false;
       

    }
}