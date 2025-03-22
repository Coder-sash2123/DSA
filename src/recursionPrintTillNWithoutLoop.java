// geeks for geeks 
// https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=print-1-to-n-without-using-loops

class Solution {
// static int cnt = 1;
    public void printNos(int n) {
        // Your code here
        
        if(n==0) return;
        printNos(n-1);
        System.out.print(n + " ");
        
    }
}


// Reverse of this 
class Solution {

    void printNos(int N) {
        // code here
        
        if(N == 0) return;
        System.out.print(N+" ");
        printNos(N-1);
    }
}


