package com.euler.problems;

public class Problem2 {
	private long sum=0;
	private long limit=0;
	
	public long getLimit() {
		return limit;
	}

	public void setLimit(long limit) {
		this.limit = limit;
	}

	private void fibino(long x,long y){
		if(y >= limit) {
			//setSum(x+y);
			return;
		}
		if((y&1L)==0)
		sum=sum+y;
		fibino(y,x+y);
	}
	
	public void setSum(long sum) {
		this.sum = sum;
	}

	public long getSum() {
		return sum;
	}

	public static void main(String[] args){
		Problem2 problem2=new Problem2();
		problem2.setLimit(4000000L);
		problem2.fibino(1, 1);
		
		System.out.println("Sum="+problem2.getSum());
		
		
	}

}
