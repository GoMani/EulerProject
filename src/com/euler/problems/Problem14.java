package com.euler.problems;

import java.util.HashMap;
import java.util.Map;

/*
 * Problem 14
The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.
 */
public class Problem14 implements Solvable{

private Map<Long,Long> chainHash=new HashMap<Long, Long>();
private Long maxRange=0L;
@Override
public void setParam(Object param) {
	if(param instanceof Long){
		maxRange=(Long)param;
	}
	// TODO Auto-generated method stub
	
}

long getCount(long num){
//	if(chainHash.containsKey(Long.valueOf(num))) {
//		return chainHash.get(num);
//		
//	}
	long prev=num;
	if(num==1) return 1; 
	if((num%2)==1){
		num=3*num+1;
	}
	else{
	num=num/2;	
	}
	long result= getCount(num);
	//chainHash.put(prev, result+1);
	return result+1;
}

void buildChain(){
	chainHash.put(1L,1L);
	long max=0;
	for(long i=1;i<=maxRange;i++){
		long temp=getCount(i);
	//	System.out.println("Value for "+i+" ==> "+temp);
		if(temp> max) {result=i; max=temp;}
	}
	
//	for(long i=1;i<maxRange;i++){
//		long temp=chainHash.get(i);
//		if(temp> result) result=i;
//		
//		//System.out.println("Value for "+i+" ==> "+temp);
//	}
}

private long result=0L;
@Override
public void solve() {
	buildChain();
}

@Override
public String result() {
	// TODO Auto-generated method stub
	return String.valueOf(result);
}

}
