package com.euler.problems;

public class Problem16 implements Solvable{
   int range=0;
   long result=0;
	@Override
	public void setParam(Object param) {
		// TODO Auto-generated method stub
		range=(Integer)param;
	}

	@Override
	public void solve() {
		// TODO Auto-generated method stub
		LongNum longNum=new LongNum();
		longNum.getNum().add((byte) 2);
		
		for(int i=2;i<=range;i++){
			longNum=longNum.mul(2);
		}
		result=longNum.sumOfDigits();
	}

	@Override
	public String result() {
		// TODO Auto-generated method stub
		return String.valueOf(result);
	}

}
