package Cakecounter;

class CakeCounter{
	int cakecount=0;
	public synchronized void cakecounter() {
		cakecount++;
	}
	
}

class Team implements Runnable{
	CakeCounter cc;
	Team(CakeCounter cc){
		this.cc=cc;
	}
	
	public void run() {
		for(int i=1;i<=10000;i++) {
			cc.cakecounter();
		}
	}
}

public class MultiThread{
	public static void main(String[]args) throws InterruptedException{
		CakeCounter cc =new CakeCounter();
		Thread t1=new Thread(new Team(cc));
		Thread t2=new Thread(new Team(cc));
		 
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println(cc.cakecount);
		
		
		
	}

	
	
}
