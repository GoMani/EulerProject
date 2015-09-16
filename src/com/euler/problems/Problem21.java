package com.euler.problems;

import java.util.HashMap;
import java.util.Map;

public class Problem21 implements Solvable {

	@Override
	public void setParam(Object param) {
		// TODO Auto-generated method stub

	}
   int range=10000;
	long total=0;
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	@Override
	public void solve() {
		// TODO Auto-generated method stub
		for(int i=1;i<=range/2;i++){
			for(int j=2;j<=range/i;j++){
				if(map.containsKey(j*i)){
					map.put(i*j, map.get(i*j)+i);
				}
				else{
					map.put(i*j, i);
				}
			}
		}
	
		for(Integer i:map.keySet()){
			Integer value=map.get(map.get(i));
			if(value !=null && value.equals(i) && value!=map.get(i)){
				total+=i;
			}
		}

	}

	@Override
	public String result() {
		// TODO Auto-generated method stub
		return String.valueOf(total);
	}

}
