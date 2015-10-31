package com.euler.problems;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem50 implements Solvable {

	@Override
	public void setParam(Object param) {
		// TODO Auto-generated method stub
		
	}
	private long max=0;
	
	long findMax(int st,int end){
		//System.out.println(st+","+end);
		if(st>=end){
			
			return primes.get(st);
		}
		long sum=0;
		for(int i=st;i<=end;i++){
			sum+=primes.get(i);
		}
		if(!primeSet.contains(sum)) {
			sum=0;
		}
		return Math.max(Math.max(sum,findMax(st, end-1)),Math.max(sum,findMax(st+1,end)));

	}
	Set<Long> primeSet=null;
	List<Long> primes=null;
	@Override
	public void solve() {
		Prime prime=new Prime();
		primes=prime.getPrimesInRange(1000000);
		primeSet=new HashSet<Long>();
		primeSet.addAll(primes);
		long sum=0;
		long maxSum=0;
		for(int i=0;i<primes.size();i++){
			sum=0;
			int count=0;
			for(int j=i;j<primes.size();j++){
				count++;
				sum+=primes.get(j);
				if(primeSet.contains(sum)){
				//	System.out.println("sum="+sum+"  "+count+","+max);
					if(count>max){
						
						max=count;
					maxSum=sum;
					}
				}
			}
			
		}
		
		max=maxSum;
		//max= findMax(0,primes.size()-1);
	}

	@Override
	public String result() {
		// TODO Auto-generated method stub
		return String.valueOf(max);
	}

}
