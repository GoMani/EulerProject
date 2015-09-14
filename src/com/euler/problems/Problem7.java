package com.euler.problems;
//10001st prime
//Problem 7
//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//
//What is the 10 001st prime number?
import java.util.ArrayList;

public class Problem7 {
	
	

	
	
	
	public static void main(String[] args){
		Prime data = new Prime(new ArrayList<Long>(10010));
		System.out.println(data.getNthPrime(10001));
		
	}
	

}
