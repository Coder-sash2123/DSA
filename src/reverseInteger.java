// leet code 
//https://leetcode.com/problems/reverse-integer/
class Solution {
    public int reverse(int x) {
        int a;
        long b= 0;
        while(x != 0){
            a=x%10;
            b=b*10+a;
            x=x/10;   
        }
        if(b<Integer.MIN_VALUE || b>=Integer.MAX_VALUE){
            return 0;
        }
        return((int) b);
        
    }
}
