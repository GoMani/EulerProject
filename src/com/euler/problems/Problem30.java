package com.euler.problems;

import java.util.ArrayList;
import java.util.List;


/*
 * Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:

1634 = 14 + 64 + 34 + 44
8208 = 84 + 24 + 04 + 84
9474 = 94 + 44 + 74 + 44
As 1 = 14 is not a sum it is not included.

The sum of these numbers is 1634 + 8208 + 9474 = 19316.

Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
 * 
 * 
 * Let k represent the power the digits are being raised to. The highest exponentiated digit sum for any n-digit number is:
n⋅9k

That product is the upper limit if it is less than the maximum n-digit number.

Since addition is a commutative operation, the order in which you sum the exponentiated digits does not matter. Thus, if you search though all the combinations of numbers from {00,01,⋯,0k−3,1,1} to {90,91,⋯,9k−1} that are less than the upper limit, the computation time can be greatly reduced.

 */
public class Problem30  implements Solvable{

	@Override
	public void setParam(Object param) {
		// TODO Auto-generated method stub
		
	}

    static List<Long> powerOf5list=new ArrayList<Long>();
	
    static {
    	for(int i=0;i<10;i++){
    		powerOf5list.add((long) (i*i*i*i*i));
    	}
    }
    
    long sumOfdigits(long number){
    	if(number < 10) return powerOf5list.get((int) number);
    	 return powerOf5list.get((int) (number%10)) +sumOfdigits(number/10);
    }
    long result=0;

	@Override
	public void solve() {
		
		for(long i=2;i<531441;i++){ // 9 to the power 5 multiplied by 9
			if(i==sumOfdigits(i)){
				System.out.println(i);
				result+=i;
			}
		}
		
	}

	@Override
	public String result() {
		// TODO Auto-generated method stub
		return String.valueOf(result);
	}

}
