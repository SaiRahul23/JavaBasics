package firstproject;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class program5 {
	public static void main(String args[]) {
		Set<Integer> a=new HashSet<Integer>();
		a.addAll(Arrays.asList(new Integer[]{1,3,2,4,5,6,8,7})); //Put 10 elements here
		Set<Integer> b=new HashSet<Integer>();
		b.addAll(Arrays.asList(new Integer[]{12,17,19,22})); //Put 10 elements here
		
		Set<Integer> union=new HashSet<Integer>(a);
		union.addAll(b);
		System.out.println(union);
		
		Set<Integer> intersection=new HashSet<Integer>(a);
		intersection.retainAll(b);
		System.out.println(intersection);
		
		Set<Integer> difference=new HashSet<Integer>(a);
		difference.addAll(b);
		System.out.println(difference);
	}
}
