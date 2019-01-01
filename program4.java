package firstproject;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class program4 {
	public static void main(String args[]) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(500);
		numbers.add(900);
		numbers.add(1400);
		numbers.add(1700);
		Collections.sort(numbers);
		System.out.println(numbers);
	}
}
