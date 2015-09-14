package com.euler.problems;

import java.util.HashMap;
import java.util.Map;

public class Problem29 implements Solvable {

	@Override
	public void setParam(Object param) {
		// TODO Auto-generated method stub

		range=(Integer)param;
	}
	int totalnums=0;
	int range=0;
	int baseRange=100;
	@Override
	public void solve() {
		// TODO Auto-generated method stub
		Map<Integer,PowerDetails> numMap=new HashMap<Integer, PowerDetails>();
		for(int i=2;i<=10;i++){
			int power=1;
			for(int j=1;j<7;j++){
				power=i*power;
				if(power<=baseRange && (numMap.isEmpty() || !numMap.containsKey(power))){
					PowerDetails powerDetails=new PowerDetails();
					powerDetails.setBasePowerIndex(j);
					powerDetails.setBase(i);
					powerDetails.setMaxPower(baseRange);
					numMap.put(power, powerDetails);
				}
			}

		}

		for(int i=2;i<=range;i++){

			if(numMap.containsKey(i)){
				PowerDetails powerDetails=numMap.get(i);

				if(powerDetails.getBase()==i){
					for(int x=2;x<=baseRange;x++){
						powerDetails.getMap().put(x, i);

					}
					powerDetails.setTotal(baseRange-1);
					totalnums+=powerDetails.getTotal();
				}else{
					int index=powerDetails.getBasePowerIndex();
					int base =powerDetails.getBase();
					PowerDetails baseDetails=numMap.get(base);
					for(int x=2;x<=baseRange;x++){
						if(baseDetails.getMap().containsKey(x*index)) continue;
						totalnums++;
						baseDetails.getMap().put(x*index, base);
					}
				}
			}
			else{
				totalnums+=(baseRange-1);
			}
		}

	}

	@Override
	public String result() {
		// TODO Auto-generated method stub
		return String.valueOf(totalnums);
	}



}
