package firstproject;

import java.util.Scanner;

class small implements Runnable{
	int arr[];
	String name;
	Thread t;
	Scanner sc=new Scanner(System.in);
	
	small(String name,int size){
		arr=new int[size];
		System.out.println("Enter the elements: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		t=new Thread(this,name);
		System.out.println("New Thread: "+t);
		t.start();
	}
	public void run() {
		int small=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<small) {
				small=arr[i];
			}
		}	
		System.out.println("Smallest: "+small);
	}
	
	//methods to find sum of even and odd can be added
}

