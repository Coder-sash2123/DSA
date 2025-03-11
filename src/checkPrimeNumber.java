// coding ninjas 
// https://www.naukri.com/code360/problems/check-prime_624934?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION

public class Solution {
	public static boolean isPrime(int num) {
		//Your code goes here
		int count = 0;
		for(int i =1; i<=num;i++){
			if (num%i == 0) count++;
		}
		if (count == 2) return YES;
		else return NO;
	}
}
