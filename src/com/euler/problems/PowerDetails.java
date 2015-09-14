package com.euler.problems;

import java.util.HashMap;
import java.util.Map;

public class PowerDetails {

	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getMaxPower() {
		return maxPower;
	}
	public void setMaxPower(int maxPower) {
		this.maxPower = maxPower;
	}
	public int getBasePowerIndex() {
		return basePowerIndex;
	}
	public void setBasePowerIndex(int basePowerIndex) {
		this.basePowerIndex = basePowerIndex;
	}
	private int total=0;
	private int maxPower=0;
	private int basePowerIndex=0;
	private int base;
	private Map<Integer,Integer> map=new HashMap<Integer, Integer>();
	public Map<Integer, Integer> getMap() {
		return map;
	}
	public void setMap(Map<Integer, Integer> map) {
		this.map = map;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
}
