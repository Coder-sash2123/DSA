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




// Optimitize solution 
                               
import java.util.*;

public class Main {

    // Function to check if a
    // given number is prime.
    static boolean checkPrime(int n){ 

        // Initialize a counter variable to
        // count the number of factors.
        int cnt = 0;

        // Loop through numbers from 1
        // to the square root of n.
        for(int i = 1; i <= Math.sqrt(n); i++){ 

            // If n is divisible by i
            // without any remainder.
            if(n % i == 0){ 

                // Increment the counter.
                cnt = cnt + 1;

                // If n is not a perfect square,
                // count its reciprocal factor.
                if(n / i != i){
                    cnt = cnt + 1;
                }
            }
        }

        // If the number of
        // factors is exactly 2.
        if(cnt == 2){
             // Return true, indicating
             // that the number is prime.
            return true;
        }
        // If the number of
        // factors is not 2.
        else{ 
            // Return false, indicating
            // that the number is not prime.
            return false; 
        }
    }

    public static void main(String[] args) {
        int n = 1483;
        boolean isPrime = checkPrime(n);
        if(isPrime){
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
                                
                            
