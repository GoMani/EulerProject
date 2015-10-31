package com.euler.problems;

public class PowerMod {
	
 public long getMod() {
		return mod;
	}


	public void setMod(long mod) {
		this.mod = mod;
	}

long  mod=100000000000L;	
 long power(long base, long power){
	 long total=1L;
	 for(long i=1L;i<=power;i++){
		 total=total*base;
		 if(total > mod){
			 total%=mod;
		 }
	 }
	 return total;
 }
 
 
 long range(long j){
	 long total=0L;
	 for(long i=1;i<=j;i++){
			total+=power(i, i);
			 if(total > mod){
				 total%=mod;
			 }
	 }
	 return total;
 }
 
 public static void main(String args[]){
	 PowerMod powerMod=new PowerMod();
	
	System.out.println( powerMod.range(1000));
 }

}
