package com.euler.problems;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem35 implements Solvable{

	
	String rotate(String source){
	
		return source.substring(1)+source.charAt(0);
	}
	
	@Override
	public void setParam(Object param) {
		// TODO Auto-generated method stub
		
	}
 long result;
	@Override
	public void solve() {
		// TODO Auto-generated method stub
		Prime pr=new Prime();
		List<Long> primes= pr.getPrimesInRange(1000000);
		Set<String> primeSet=new HashSet<String>();
 		for(Long primeNum:primes){
 			String primeStr=primeNum.toString();
 			if(primeStr.length() <2 || !primeStr.matches(".*[024568].*")){
 			primeSet.add(primeNum.toString());	
 			}
 		}
 		
 		int count=0;
 		for(String primeNum:primeSet){
 			System.out.println(primeNum);
 			String primeStr=primeNum;
 			if(primeStr.length()<1){System.out.println("singles"+primeNum); count++;continue;}
 			boolean found=true;
 			for(int i=1;i<primeStr.length();i++){
 				primeStr =rotate(primeStr);
 				if(!primeSet.contains(primeStr)){
 					System.out.println("not found"+primeNum);
 					found=false;
 					break;
 				}
 			}
 			if(found) count++;
 		}
 		
 		result=count;
	}

	@Override
	public String result() {
		// TODO Auto-generated method stub
		return String.valueOf(result);
	}

}
