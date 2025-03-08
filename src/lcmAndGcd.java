// Geeks for geeks 
// https://www.geeksforgeeks.org/problems/lcm-and-gcd4516/1
//seen the code from submissions 

class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int gdc=gdc(a,b);
        int lcm=a*b/gdc;
        int arr[]={lcm,gdc};
        return arr;
    }
    public static int gdc(int a,int b){
        while(b>0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
