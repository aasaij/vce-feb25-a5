package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(11,21,30,40,3,4,5,7,9,6,4,4,323,5));
		
//		list.forEach(data -> System.out.println(data));
		//Square all list even elements and printing them
		list.stream()
		.sorted()
		.filter(x->x%2==0)
		.map(x->x*x)
		.forEach(System.out::println);
	}

}
