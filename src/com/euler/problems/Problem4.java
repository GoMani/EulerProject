package com.euler.problems;

//Largest palindrome product
//Problem 4
//A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//
//Find the largest palindrome made from the product of two 3-digit numbers.

//P=100000x10000y1000z100z10yx
//P=100001x10010y1100z
//P=119091x910y100z


public class Problem4 {

	private long formPalindrome(int i){
		String num=String.valueOf(i);
		StringBuilder str=new StringBuilder();
	
		return Long.parseLong(num+str.reverse().toString());
		
	}
	
	private long findTheMax(){
		for(int i=999;i>99;i--){
			long poly=formPalindrome(i);
			for(int j=990;j>109;j-=11){
				if(poly%j==0) {
					int div=(int) (poly/j);
					if(div >99 && div <1000)
						return poly;
				}
			}
		}
		return -1;
	}

 public static void  main(String[] args) {
	 System.out.println(new Problem4().findTheMax());
	
}
}
