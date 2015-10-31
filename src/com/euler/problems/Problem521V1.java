package com.euler.problems;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class WorkerThread implements Runnable {
    
    private String command;
    public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public long getSum() {
		return sum;
	}

	public void setSum(long sum) {
		this.sum = sum;
	}

	public long getStart() {
		return start;
	}

	public void setStart(long start) {
		this.start = start;
	}

	public long getEnd() {
		return end;
	}

	public void setEnd(long end) {
		this.end = end;
	}

	public Prime getPrime() {
		return prime;
	}

	public void setPrime(Prime prime) {
		this.prime = prime;
	}
	 private ArrayBlockingQueue<Long> queue;
	public ArrayBlockingQueue<Long> getQueue() {
		return queue;
	}

	public void setQueue(ArrayBlockingQueue<Long> queue) {
		this.queue = queue;
	}
	private long sum=0;
    private long start=0;
    private long end=0;
    private Prime prime; 
    public WorkerThread(String s){
        this.command=s;
    }
 
    @Override
    public void run() {
        //System.out.println(Thread.currentThread().getName()+" Start. Command = "+command);
        processCommand();
       // System.out.println(Thread.currentThread().getName()+" End.");
    }
 
    private void processCommand() {
    	for(long i=start;i<=end;i+=2){
    		if((i>>1)%1000000==0)
    		System.out.println(i);
    		sum+=prime.getLeastPrimeFactor(i)+2;
    		sum%=1000000000;
    	}
    	queue.add(sum);
    	System.out.println(sum);
       
    }
 
    @Override
    public String toString(){
        return this.command;
    }
}
public class Problem521V1 implements Solvable {

	@Override
	public void setParam(Object param) {
		// TODO Auto-generated method stub
		
	}
    private ArrayBlockingQueue<Long> queue=new ArrayBlockingQueue<Long>(1000);
	long result=0;
	@Override
	public void solve() {
	Prime prime=new Prime(new LinkedList<Long>());
	long sum=0;
	prime.primes.add((long) 2);
	prime.primes.add((long) 3);
	sum=2+3+2;
	long temp=0;
	long range=10;
	for(long i=5;i<=range;i+=2){
		if((i>>1)%1000000==0)
		System.out.println(i);
		sum+=prime.getLeastPrimeFactor(i)+2;
		sum%=1000000000;
	}
	temp=sum+1;
	List<List<Long>>  lists= new LinkedList<List<Long>>();
	for(int i=0;i<10;i++){
	 List<Long> list=new LinkedList<Long>();
	  list.addAll(prime.getPrimes());
	  lists.add(list);
	}
	sum=0;
	
	  for(long  k=0;k<10;k++){
		  ExecutorService executor = Executors.newFixedThreadPool(10);
      for (long i = 0; i < 10; i++) {
    	  WorkerThread worker = new WorkerThread("" + i);
    	
          worker.setPrime(new Prime(lists.get((int) i)));
          worker.setQueue(queue);
          worker.setStart(k*10*range+i*range+1);
          worker.setEnd(k*10*range+i*range+range);
          executor.execute(worker);
        }
      executor.shutdown();
      while (!executor.isTerminated()) {
      }
      System.out.println("Finished all threads");
      for(Long l:queue){
    	  sum+=l;
      }
	result=sum%=1000000000;
	  }
	  
	  result-=1;
	  
	}

	@Override
	public String result() {
		// TODO Auto-generated method stub
		return String.valueOf(result);
	}

}
/*

9999999
Result 714961609
Time Taken is  = 123097 	millsec{s)

Result 714961609
Time Taken is  = 2644 	millsec{s)
10^8
Result 813374515
Time Taken is  = 57007 	millsec{s)
10 ^9
Result 10688477
Time Taken is  = 1356453 	millsec{s)
Result 813374515
Time Taken is  = 20091 	millsec
Result 10688477
Time Taken is  = 416757 	millsec{s)
*/