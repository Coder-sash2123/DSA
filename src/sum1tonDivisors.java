// Sum 1 to n Divisor
// https://www.geeksforgeeks.org/problems/sum-of-all-divisors-from-1-to-n4738/1

class Solution {
    public static int sumOfDivisors(int n) {
        // code here
        int sum = 0;
        for(int i = 1; i<=n;i++){
            sum = sum + f(i);
        }
        
        return (sum);
    }
    public static int f(int i){
        int sum = 0;
        for(int j=1; j<=i;j++){
            if(i%j == 0){
                sum = sum + j; 
            }
        }
        return(sum);
    }
}
