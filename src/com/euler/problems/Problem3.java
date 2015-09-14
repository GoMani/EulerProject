package com.euler.problems;

//The prime factors of 13195 are 5, 7, 13 and 29.
//
//What is the largest prime factor of the number 600851475143 ?

public class Problem3 {
	long maxDivisor=1;
	
	

	public long getMaxDivisor() {
		return maxDivisor;
	}

	public void setMaxDivisor(long maxDivisor) {
		this.maxDivisor = maxDivisor;
	}

	private void findDivisor(long num,long from){
		if(num ==1 || from >num) return;
//		if(num==from){
//			if(from> maxDivisor){
//				maxDivisor=from;
//			}
//		}
		if(num%from==0){
			if(from> maxDivisor){
				maxDivisor=from;
			}
			num=num/from;
			findDivisor(num, from);
		}else{
		findDivisor(num, from+2);
		}
	}
	
	public static void main(String[] args){
		Problem3 problem3=new Problem3();
		long number=600851475143L;
		if(number%2==0){
			problem3.setMaxDivisor(2);
		}
		problem3.findDivisor(number, 3);
		System.out.println("MAx Divisior "+problem3.getMaxDivisor());
	}
		

}
