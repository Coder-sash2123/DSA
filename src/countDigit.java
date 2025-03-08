//

class Solution {
    static int evenlyDivides(int n) {
        // code here
        int count=0,a;
        int t = n;
        while(t>0){
            a = t%10; 
            if(a>0 && n%a==0){
                count++;
            }
            t = t/10;
        }
        return(count);
    }
}
