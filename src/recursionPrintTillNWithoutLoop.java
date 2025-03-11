// geeks for geeks 
// https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=print-1-to-n-without-using-loops

class Solution {
// static int cnt = 1;
    public void printNos(int n) {
        // Your code here
        
        if(n==0) return;
        printNos(n-1);
        System.out.print(n + " ");
        
        
        
   //My code no idea why it didnt work for n=2 and others maybe      
        // if( cnt > n) return;
        
        // System.out.print(cnt + " ");
        // cnt = cnt+ 1;
        // printNos(n);
        
    }
}
