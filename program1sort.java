package firstproject;

import java.util.Arrays;
import java.util.Scanner;

class sort implements Runnable{
	int arr[];
	String name;
	Thread t;
	Scanner sc=new Scanner(System.in);
	
	sort(String name,int size){
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
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(" "+arr[i]);
	}
	
	//methods to find sum of even and odd can be added
}

