public class program3{
	public static void main(String args[]) {
		pali p=new pali("pali",534);
		prime p1=new prime("prime");
	}
}

class pali implements Runnable{

	String name;
	Thread t;
	Scanner sc=new Scanner(System.in);
	
	pali(String name,int num){
		t=new Thread(this,name);
		System.out.println("New Thread: "+t);
		t.start();
	}
	public void run() {
		//PALINDROME CHECKER CODE HERE
	}
}

class prime implements Runnable{
	
	String name;
	Thread t;
	
	sort(String name){
		t=new Thread(this,name);
		System.out.println("New Thread: "+t);
		t.start();
	}
	public void run() {
		//PRIME NUMBER CODE HERE
	}
}
