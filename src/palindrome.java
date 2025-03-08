// leetcode 
//https://leetcode.com/problems/palindrome-number/

class Solution {
    public boolean isPalindrome(int x) {
        //if(x<0) return false;
        int a, b=0,t=x;
        while(t!=0){
            a=t%10;
            b=b*10+a;
            t=t/10;
        }
        return x>=0 && b == x;
    }
}
