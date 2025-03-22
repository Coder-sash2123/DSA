// coding ninjas 
// https://www.naukri.com/code360/problems/check-prime_624934?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION

// optimized solution 

public class Solution {
	public static String isPrime(int num) {
		//Your code goes here
		int count = 0;
		if (num == 1){
			count = 1;
		}
		
		for(int i =2; i<Math.sqrt(num);i++){
			if (num%i == 0) count++;
			if (count==1) break;
		}

		if(count == 0) return "YES";
		else return "NO";
		
	}
}
