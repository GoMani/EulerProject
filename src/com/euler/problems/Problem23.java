package com.euler.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem23 implements Solvable {

	@Override
	public void setParam(Object param) {
		// TODO Auto-generated method stub

	}
	int range=28124;
	long total=0;
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	@Override
	public void solve() {
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

		List<Integer> abundants=new ArrayList<Integer>();

		for(Integer in:map.keySet()){
			if(in < map.get(in)){
				abundants.add(in);
			}
		}
		Map<Integer, Integer> mapNum = new HashMap<Integer, Integer>();
		for(int i=1;i<=range;i++){
			mapNum.put(i,i);
		}
		for(int i=0;i<abundants.size();i++){
			for(int j=i; j<abundants.size();j++){
				mapNum.remove(abundants.get(i)+abundants.get(j));
			}
		}

		for(Integer in:mapNum.keySet()){
			total+=in;
		}

	}

	@Override
	public String result() {
		// TODO Auto-generated method stub
		return String.valueOf(total);
	}

}
