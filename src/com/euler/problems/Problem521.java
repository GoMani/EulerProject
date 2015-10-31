package com.euler.problems;

import java.util.LinkedList;



public class Problem521 implements Solvable {

	@Override
	public void setParam(Object param) {
		// TODO Auto-generated method stub
		
	}

	long result=0;
	@Override
	public void solve() {
	Prime prime=new Prime(new LinkedList<Long>());
	long sum=0;
	prime.primes.add((long) 2);
	prime.primes.add((long) 3);
	sum=2+3+2;
	
	for(long i=5;i<=10000000;i+=2){
		if((i>>1)%1000000==0)
		System.out.println(i);
		sum+=prime.getLeastPrimeFactor(i)+2;
		sum%=1000000000;
	}
	result=sum;	
	}

	@Override
	public String result() {
		// TODO Auto-generated method stub
		return String.valueOf(result);
	}

}
/*

9999999
Result 714961609
Time Taken is  = 123097 	millsec{s)

Result 714961609
Time Taken is  = 2644 	millsec{s)
10^8
Result 813374515
Time Taken is  = 57007 	millsec{s)
10 ^9
Result 10688477
Time Taken is  = 1356453 	millsec{s)
*/