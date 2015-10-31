package com.euler.problems;

public class Problem48 implements Solvable {

	@Override
	public void setParam(Object param) {
		// TODO Auto-generated method stub
	
	}
  long range=1000L;	
  long mod=10000000000L;
  long result=0L;
	@Override
	public void solve() {
		 PowerMod powerMod=new PowerMod();
			powerMod.setMod(mod);
			result=powerMod.range(range);
		
	}

	@Override
	public String result() {
		// TODO Auto-generated method stub
		return String.valueOf(result);
	}

}
