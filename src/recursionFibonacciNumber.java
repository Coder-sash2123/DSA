// Leet Code 
// Fibonacci Number using recursion 
// https://leetcode.com/problems/fibonacci-number/description/

class Solution {
    public int fib(int n) {
        if (n <= 1) return n;   // or we can write these 3 if conditipons also to reduce runtime if(n==0) return 0; if(n ==1 || n==2) return 1; else if(n<5) return n-1;  
        return fib(n-1) + fib(n-2);  
    }
}
