package com.euler.problems;

import java.util.ArrayList;
import java.util.List;

public class LongNum {
	public List<Byte> num;

	public LongNum() {
		this.num = new ArrayList<Byte>();
	}
	
	public List<Byte> getNum() {
		return num;
	}

	public void setNum(List<Byte> num) {
		this.num = num;
	}
	
	public  LongNum mul(int times){
		LongNum temp=new LongNum();
		int carry=0;
		for(int i=0;i<this.num.size();i++){
			int mul=this.num.get(i)*times+carry;
			temp.num.add(i, (byte) (mul%10));
			carry=mul/10;
		}
		while(carry>0){
			temp.num.add((byte) (carry%10));
			carry=carry/10;
		}
		return temp;
	}
	
	public long sumOfDigits(){
		System.out.println("");
		long sum=0;
		for(int i=0;i<this.num.size();i++){
			System.out.print(this.num.get(i));
			sum+=this.num.get(i);
		}
		System.out.println("");
		return sum;
	}
	public  LongNum add(LongNum b){
		LongNum temp=new LongNum();
		int carry=0;
		if(b.getNum().size()> this.getNum().size()){
			int i=0;
			for( i=0;i<this.num.size();i++){
				
				int sum=b.num.get(i)+this.num.get(i)+carry;
				temp.num.add(i, (byte) (sum%10));
				carry=sum/10;
			}
			
			for(;i<b.num.size();i++){
				
				int sum=b.num.get(i)+carry;
				temp.num.add(i, (byte) (sum%10));
				carry=sum/10;
			}
			
			if(carry>0){
				temp.num.add((byte) carry);
			}
			
			
		} else {
			int i=0;
			for (; i < b.num.size(); i++) {

				int sum = b.num.get(i) + this.num.get(i) + carry;
				temp.num.add(i, (byte) (sum % 10));
				carry = sum / 10;
			}
			
			for(;i<this.num.size();i++){
				
				int sum=this.num.get(i)+carry;
				temp.num.add(i, (byte) (sum%10));
				carry=sum/10;
			}
			
			if(carry>0){
				temp.num.add((byte) carry);
			}
			

		}
		return temp;
	}
}