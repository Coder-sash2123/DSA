// Reverse of Array (Using of recursion) 
// Geeks for geeks 
// https://www.geeksforgeeks.org/problems/reverse-an-array/0

// Normal Solution 

class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int temp = 0;
        int k = arr.length-1;
        for(int i =0; i<=k/2;i++){
            temp = arr[k-i];
            arr[k-i] = arr[i];
            arr[i] = temp;
        }
        // for(int i= 0; i<=k; i++){
        //     System.out.print(arr[i]+ " ");
        // }
    }
}


// Recursion Main code 

class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n = arr.length-1;
        reverse(0,n,arr);
    }
    
    private void reverse(int i,int n,int arr[]){
        if(i>=n){
            return;
        }
     int temp = arr[i];
     arr[i] = arr[n];
     arr[n] = temp;
     
     reverse(i+1,n-1,arr);
     
    }
}
