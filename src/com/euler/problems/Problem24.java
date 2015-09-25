package com.euler.problems;

import java.util.ArrayList;
import java.util.List;

public class Problem24 implements Solvable {

	@Override
	public void setParam(Object param) {
		// TODO Auto-generated method stub

	}

	@Override
	public void solve() {
		// TODO Auto-generated method stub

	}
List<Integer> numbers=new ArrayList<Integer>();
long range=10;
long pos=1000000-1;
	@Override
	public String result() {
		for(int i=0;i<10;i++){
			numbers.add(i);
		}
		long product=1;
		for(int j=1;j<range;j++){
			product*=j;
		}
	
		for(int i=0;i<range;i++){
		
			int div=(int) (pos/product);
			System.out.print(numbers.get(div));
			numbers.remove(div);
			pos=pos%product;
			if(range-i-1!=0)
			product=product/(range-i-1);
		}
		// TODO Auto-generated method stub
		return null;
	}

}
