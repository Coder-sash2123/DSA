// coding ninjass 
// https://www.naukri.com/code360/problems/check-armstrong_589?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION

import java.util.Scanner;
import java.lang.Math;

public class Main {
	

	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int dig = numberOfDigits(n);
		System.out.println(armstrongNumber(n,dig));		
	}


	static int numberOfDigits(int n){
		int dig = 0;
		while(n!=0){
			n = n/10;
			dig++;
		}
		return(dig);
	}

	static Boolean armstrongNumber(int n,int dig){
		int rem = 0, arm =0;
		int a = n;
		while(n!=0){
			rem = n%10;
			arm = arm + (int) Math.pow(rem,dig);

			n =n/10;
		}
		return a==arm;
	}
