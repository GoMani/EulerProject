package com.euler.problems;

//Smallest multiple
//Problem 5
//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

public class Problem5 {
	
	private static int gcd(int a,int b){
	
		if(a%b!=0){
		
			b=gcd(b,a%b);
			
		}
		
		return b;
		
	}
	
public static void main(String[] args){
	int total=20;
	for(int i=total-1;i>1;i--){
		if(total%i==0){
			continue;
		}
		int temp=gcd(total,i);
	
		total=total*i/temp;
	}
	
	System.out.println(total);
}
	
}
