package com.euler.problems;
/*The Fibonacci sequence is defined by the recurrence relation:

Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
Hence the first 12 terms will be:

F1 = 1
F2 = 1
F3 = 2
F4 = 3
F5 = 5
F6 = 8
F7 = 13
F8 = 21
F9 = 34
F10 = 55
F11 = 89
F12 = 144
The 12th term, F12, is the first term to contain three digits.

What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
 * 
 * 
 * Binet's formula finds the nth Fibonacci number.
Fn=ϕn−(−ϕ)−n5√, ϕ=1+5√2


Since ∣∣−(−ϕ)−n5√∣∣<0.171 for n>1, n∈W, Fn can be approximated as:
ϕn5√


If a number has t digits, it is greater than 10t−1.

ϕn5√>10t−1
n⋅logϕ−log52>t−1
n>t+log52−1logϕ

The index of the first term in the Fibonacci sequence to contain t digits is:
⎡⎢⎢⎢t+log52−1logϕ⎤⎥⎥⎥
 */

public class Problem25 implements Solvable{


	
	
	@Override
	public void setParam(Object param) {
		// TODO Auto-generated method stub
		
		
	}
 long result;
	@Override
	public void solve() {
		LongNum f1=new LongNum();
		f1.getNum().add((byte)1);
		LongNum f2=new LongNum();
		f2.getNum().add((byte)1);
		for(long i=3;i<10000;i++){
		LongNum temp=f1.add(f2);
		if(temp.getNum().size()==1000){
			result=i;
			System.out.println(i);
			break;
		}
		f1=f2;
		f2=temp;
		}
	}

	@Override
	public String result() {
		// TODO Auto-generated method stub
		return String.valueOf(result);
	}

}
