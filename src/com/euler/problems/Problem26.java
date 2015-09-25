package com.euler.problems;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Problem26 implements Solvable {

	@Override
	public void setParam(Object param) {
		// TODO Auto-generated method stub

	}

	class Freq{
	    public int value;
	    public Map<Integer,Integer> freqMap;
	    public int lastPos;
	    public int prevFreq;
	}
	
	Map<Integer,Freq> map;
	String numbers="0123456789";
	private int  findDecimal(long n){
		System.out.println( "Started for "+n);
		map=new HashMap<Integer, Problem26.Freq>();
		int den=1;
		int div=0;
		String fract="";
		String frag="";
		int pos=0;
		while(den!=0){
			if(den>n){
				pos++;
				div=(int) (den/n);
				den=(int) (den%n);
				System.out.print(div);
				fract+=div;
				if(map.containsKey(div)){
					Freq  freq=map.get(div);
					
					
					Map<Integer,Integer> temp=new HashMap<Integer, Integer>();
					for(Integer  val:freq.freqMap.values())
					{
						if(pos-val !=0 && freq.freqMap.containsKey(pos-val)) {
							int prevOcc=freq.freqMap.get(pos-val)-(pos-val);
							System.out.println("prev Pos"+prevOcc+" "+ fract.charAt(prevOcc-1)+" "+ numbers.charAt(div));
							if(prevOcc>0 && fract.charAt(prevOcc-1)==numbers.charAt(div))
							return pos-val;
						}
						temp.put(pos-val,pos);
					}
					freq.freqMap.putAll(temp);
					
				}else{
					Freq  freq=new Freq();
					   freq.lastPos=pos;
					  freq.freqMap=new  HashMap<Integer, Integer>();
					  freq.freqMap.put(0,pos);
					   map.put(div, freq);
				}
				
				
			}else{
				den*=10;
			}

		}

		System.out.println(frag.length()+ " "+frag);
		return frag.length();
	}
	long result=0;
	@Override
	public void solve() {
		List<Long> primes=new ArrayList<Long>();

		Prime p=new Prime(primes);
		p.getPrimesInRange(10L);
		int max=0;

		//for(Long num:primes){
		for(int num=2;num<=1000;num++){
			int deciLen=findDecimal(num);
			System.out.println("Rep Len for "+num+" ="+deciLen);
			if(deciLen>max){
				max=deciLen;
				result=num;
			}
		}
	}

	@Override
	public String result() {
		// TODO Auto-generated method stub
		return String.valueOf(result);
	}

}
