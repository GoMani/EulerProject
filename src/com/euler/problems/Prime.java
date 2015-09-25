package com.euler.problems;

import java.util.ArrayList;
import java.util.List;

public class Prime {
	public List<Long> primes;

	public Prime() {
		this.primes = new ArrayList<Long>();
	}
	public Prime(List<Long> primes) {
		this.primes = primes;
	}
	
	private boolean checkPrime(long i){
		long max=(long)Math.sqrt(i);
		for(Long prime:primes){
			if(i%prime.intValue()==0)
				return false;
			if(prime >max){
				break;
			}
		}
		
		primes.add(Long.valueOf(i));
		return true;	
		
		
	}
	
	
	public long getNthPrime(long n){
		
		if(n==1) return 2;
		if(n==2) return 3;
		primes.add(Long.valueOf(2));
		primes.add(Long.valueOf(3));
		long primeCnt=2;
		for(long i=5;;i+=2){
			if(checkPrime(i)){
				primeCnt++;
				if(primeCnt==n){
					return i;
				}
			}
		}
	}
	
	
public List<Long> getPrimesInRange(long n){
	
	primes.add(Long.valueOf(2));
	if(n==2)  return primes;
	
		primes.add(Long.valueOf(3));
		if(n==3)  return primes;
		
	
		for(long i=5;i<=n;i+=2){
			checkPrime(i);
			}
		return primes;
	}
	
	public long sumOfPrimes(long max){
		if(max==2) return 2;
		if(max==3) return 2+3;
		primes.add(Long.valueOf(2));
		primes.add(Long.valueOf(3));
		long sum=2+3;
		for(long i=5;i<=max;i+=2){
			if(checkPrime(i)){
	         sum+=i;
				
			}
		}
		return sum;
	}
}