package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Oddnumber {

	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(3,5,6,8,9,10);
		Stream<Integer> s1=nums.stream();
		Stream<Integer> s2=s1.filter(n->n%2!=0);
		int result=s2.reduce(1,(c,e)->c*e);
		
		System.out.println(result);
		

	}

}
