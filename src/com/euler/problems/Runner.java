package com.euler.problems;

public class Runner {

	public static void run(Solvable solvable){
		long start1 = System.currentTimeMillis();
		solvable.solve();
		long start2 = System.currentTimeMillis();
		 System.out.println("Result " +solvable.result());
		 System.out.println("Time Taken is  = "+(start2-start1)+" 	millsec{s)");
	}
	
	public static void main(String[] args){
		//run(new Problem13());
//		Solvable prob=new Problem14();
//		prob.setParam(Long.valueOf(1000000L));

		
//		Solvable prob=new Problem18();
//		prob.setParam(14);
//		
		
	//	Solvable prob=new Problem30();
		
	//	Solvable prob=new Problem25();
//       Solvable prob=new Problem20();
//       			prob.setParam(100);
       			
//       			Solvable prob=new Problem16();
//       			prob.setParam(1000);
       			
       			
       			Solvable prob=new Problem21();
       			prob.setParam(100);
		run(prob);
	}

}
