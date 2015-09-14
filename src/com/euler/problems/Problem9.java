package com.euler.problems;
//
//Special Pythagorean triplet
//Problem 9
//A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
////
//a2 + b2 = c2
//For example, 32 + 42 = 9 + 16 = 25 = 52.
//
//There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//Find the product abc.

public class Problem9 {
	
	public static void main(String[] args){
		
		
		for(long i=1;i<1000;i++){
			if((500000-1000*i)%(1000-i)==0){
				long j=(500000-1000*i)/(1000-i);
				long k=1000-i-j;
				if(j>0){
				System.out.println(i*j*k);
				break;
				}
			}
		}
	}

}
